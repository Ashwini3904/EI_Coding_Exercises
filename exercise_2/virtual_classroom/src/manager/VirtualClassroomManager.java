package manager;

import exceptions.*;
import factory.AssignmentFactory;
import factory.StudentFactory;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.*;
import model.*;

public class VirtualClassroomManager {
    private final Map<String, Classroom> classrooms = new HashMap<>();
    private final Map<String, Student> students = new HashMap<>();

    public VirtualClassroomManager() {
        printWelcomeMessage();
    }

    private void printWelcomeMessage() {
        System.out.println("Welcome to the Virtual Classroom Manager!");
        System.out.println("Available commands:");
        System.out.println("  add_classroom <name>");
        System.out.println("  remove_classroom <name>");
        System.out.println("  add_student <StudentId> <ClassName>");
        System.out.println("  schedule_assignment <ClassName> <AssignmentName> <DueDate:yyyy-MM-dd>");
        System.out.println("  submit_assignment <StudentId> <ClassName> <AssignmentName>");
        System.out.println("  list_classrooms");
        System.out.println("  list_students <ClassName>");
        System.out.println("  list_submissions <ClassName> <AssignmentName>");
        System.out.println("  exit");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("\nEnter command: ");
            String command = sc.nextLine().trim();
            String[] parts = command.split(" ");

            try {
                switch (parts[0]) {
                    case "add_classroom": addClassroom(parts); break;
                    case "remove_classroom": removeClassroom(parts); break;
                    case "add_student": addStudent(parts); break;
                    case "schedule_assignment": scheduleAssignment(parts); break;
                    case "submit_assignment": submitAssignment(parts); break;
                    case "list_classrooms": System.out.println(listClassrooms()); break;
                    case "list_students": System.out.println(listStudents(parts)); break;
                    case "list_submissions": System.out.println(listSubmissions(parts)); break;
                    case "exit":
                        System.out.println("Goodbye!");
                        running = false;
                        break;
                    default: throw new InvalidCommandException("Unknown command: " + parts[0]);
                }
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }

    private void addClassroom(String[] parts) {
        if (parts.length < 2) throw new InvalidCommandException("Usage: add_classroom <name>");
        String name = parts[1];
        if (classrooms.containsKey(name)) throw new ClassroomAlreadyExistsException("Classroom " + name + " already exists.");
        classrooms.put(name, new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    private void removeClassroom(String[] parts) {
        if (parts.length < 2) throw new InvalidCommandException("Usage: remove_classroom <ClassName>");
        String className = parts[1];

        if (!classrooms.containsKey(className)) {
            throw new ClassroomNotFoundException("Classroom " + className + " does not exist.");
        }

        classrooms.remove(className);
        System.out.println("Classroom " + className + " has been removed.");
    }

    private void addStudent(String[] parts) {
        if (parts.length < 3) 
            throw new InvalidCommandException("Usage: add_student <StudentId> <ClassName>");
        
        String studentId = parts[1];
        String className = parts[2];

        Classroom classroom = classrooms.get(className);
        if (classroom == null) 
            throw new ClassroomNotFoundException("Classroom " + className + " does not exist.");

        Student student = students.computeIfAbsent(studentId, StudentFactory::createStudent);
        if (classroom.hasStudent(studentId)) 
            throw new StudentAlreadyExistsException("Student " + studentId + " is already enrolled in " + className + ".");

        classroom.enrollStudent(student);

        //First show enrollment message
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");

        //Then notify about already scheduled assignments
        for (Assignment assignment : classroom.getAssignments()) {
            student.update("Reminder: Assignment \"" + assignment.getName() +
                           "\" already scheduled in " + className +
                           " (Due: " + assignment.getDueDate() + ")");
        }
    }

    private void scheduleAssignment(String[] parts) {
        if (parts.length < 4) 
            throw new InvalidCommandException("Usage: schedule_assignment <ClassName> <AssignmentName> <DueDate:yyyy-MM-dd>");

        String className = parts[1];
        String assignmentName = parts[2];
        String dueDateStr = parts[3];

        Classroom classroom = classrooms.get(className);
        if (classroom == null) 
            throw new ClassroomNotFoundException("Classroom " + className + " does not exist.");

        if (classroom.getStudents().isEmpty()) {
            System.out.println("Classroom " + className + " has no students. Cannot schedule assignment.");
            return;
        }

        try {
            LocalDate dueDate = LocalDate.parse(dueDateStr);
            Assignment assignment = AssignmentFactory.createAssignment(assignmentName, dueDate);
            classroom.addAssignment(assignment);

            //First print scheduling message
            System.out.println("Assignment " + assignmentName + " for " + className + " has been scheduled.");

            //Then notify students
            for (Student s : classroom.getStudents()) {
                s.update("New assignment \"" + assignmentName + "\" added to class " + className +
                         " (Due: " + dueDate + ")");
            }
        } catch (DateTimeParseException e) {
            throw new InvalidDateFormatException("Invalid date format. Use yyyy-MM-dd.");
        }
    }

    private void submitAssignment(String[] parts) {
        if (parts.length < 4) throw new InvalidCommandException("Usage: submit_assignment <StudentId> <ClassName> <AssignmentName>");
        String studentId = parts[1];
        String className = parts[2];
        String assignmentName = parts[3];

        Classroom classroom = classrooms.get(className);
        if (classroom == null) throw new ClassroomNotFoundException("Classroom " + className + " does not exist.");
        if (!classroom.hasStudent(studentId)) throw new StudentNotFoundException("Student " + studentId + " is not enrolled in " + className);

        Assignment assignment = classroom.getAssignment(assignmentName);
        if (assignment == null) throw new AssignmentNotFoundException("Assignment " + assignmentName + " not found in " + className);

        LocalDateTime now = LocalDateTime.now();
        String status = now.toLocalDate().isAfter(assignment.getDueDate()) ? "(LATE)" : "";

        assignment.markSubmitted(studentId);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + " " + status);
    }

    private String listClassrooms() {
        if (classrooms.isEmpty()) return "No classrooms available.";
        return "Classrooms: " + String.join(", ", classrooms.keySet());
    }

    private String listStudents(String[] parts) {
        if (parts.length < 2) throw new InvalidCommandException("Usage: list_students <ClassName>");
        String className = parts[1];
        Classroom classroom = classrooms.get(className);
        if (classroom == null) throw new ClassroomNotFoundException("Classroom " + className + " does not exist.");
        return classroom.listStudents();
    }

    private String listSubmissions(String[] parts) {
        if (parts.length < 3) throw new InvalidCommandException("Usage: list_submissions <ClassName> <AssignmentName>");
        String className = parts[1];
        String assignmentName = parts[2];

        Classroom classroom = classrooms.get(className);
        if (classroom == null) throw new ClassroomNotFoundException("Classroom " + className + " does not exist.");
        Assignment assignment = classroom.getAssignment(assignmentName);
        if (assignment == null) throw new AssignmentNotFoundException("Assignment " + assignmentName + " not found in " + className);

        StringBuilder sb = new StringBuilder("Submissions for " + assignmentName + " in " + className + ":\n");

        if (assignment.getSubmittedStudents().isEmpty()) {
            sb.append("Submitted: None\n");
        } else {
            sb.append("Submitted: ").append(String.join(", ", assignment.getSubmittedStudents())).append("\n");
        }

        List<String> notSubmitted = new ArrayList<>();
        for (Student s : classroom.getStudents()) {
            if (!assignment.isSubmitted(s.getId())) {
                notSubmitted.add(s.getId());
            }
        }

        if (notSubmitted.isEmpty()) {
            sb.append("Not Submitted: None");
        } else {
            sb.append("Not Submitted: ").append(String.join(", ", notSubmitted));
        }

        return sb.toString();
    }
}
