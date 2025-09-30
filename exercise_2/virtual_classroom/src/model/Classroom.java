package model;

import java.util.*;

public class Classroom {
    private final String name;
    private final List<Student> students = new ArrayList<>();
    private final List<Assignment> assignments = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public boolean hasStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
        // notifyStudents("New assignment \"" + assignment.getName()
        //         + "\" added to class " + name + " (Due: " + assignment.getDueDate() + ")");
    }

    public Assignment getAssignment(String name) {
        for (Assignment a : assignments) {
            if (a.getName().equalsIgnoreCase(name)) return a;
        }
        return null;
    }

    // Add this getter so manager can loop assignments
    public List<Assignment> getAssignments() {
        return assignments;
    }

    public List<Student> getStudents() { return students; }

    public String listStudents() {
        if (students.isEmpty()) return "No students enrolled in " + name;
        StringBuilder sb = new StringBuilder("Students in " + name + ": ");
        for (Student s : students) sb.append(s.getId()).append(" ");
        return sb.toString().trim();
    }

    // private void notifyStudents(String message) {
    //     for (Student s : students) {
    //         s.update(message);
    //     }
    // }
}
