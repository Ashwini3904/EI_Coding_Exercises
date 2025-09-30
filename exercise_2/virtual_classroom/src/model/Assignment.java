package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Assignment {
    private final String name;
    private final LocalDate dueDate;
    private final Set<String> submittedStudents = new HashSet<>();

    public Assignment(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public String getName() { return name; }
    public LocalDate getDueDate() { return dueDate; }

    public void markSubmitted(String studentId) {
        submittedStudents.add(studentId);
    }

    public boolean isSubmitted(String studentId) {
        return submittedStudents.contains(studentId);
    }

    public Set<String> getSubmittedStudents() {
        return submittedStudents;
    }
}
