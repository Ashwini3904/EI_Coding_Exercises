package factory;

import java.time.LocalDate;
import model.Assignment;

public class AssignmentFactory {
    public static Assignment createAssignment(String name, LocalDate dueDate) {
        return new Assignment(name, dueDate);
    }
}
