package model;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {
    private final String id;
    private final List<String> submittedAssignments = new ArrayList<>();

    public Student(String id) {
        this.id = id;
    }

    public String getId() { return id; }

    public void submitAssignment(String assignmentName) {
        submittedAssignments.add(assignmentName);
    }

    public List<String> getSubmittedAssignments() {
        return submittedAssignments;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for Student " + id + ": " + message);
    }
}
