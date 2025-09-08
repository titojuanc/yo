package duke.choice;

public class EmployeeNotInDeptException extends RuntimeException {
    public EmployeeNotInDeptException(String message) {
        super(message);
    }
}
