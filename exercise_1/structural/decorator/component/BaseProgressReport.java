package component;

public class BaseProgressReport implements ProgressReport {

    public BaseProgressReport() {
    }
    @Override
    public void display() {
        System.out.println("Progress Report");
        System.out.println("Grades: Math=A, Science=B+, English=D");
    }
}
