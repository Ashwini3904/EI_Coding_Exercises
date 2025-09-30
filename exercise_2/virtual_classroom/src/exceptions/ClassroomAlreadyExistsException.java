package exceptions;

public class ClassroomAlreadyExistsException extends RuntimeException {
    public ClassroomAlreadyExistsException(String message) {
        super(message);
    }
}
