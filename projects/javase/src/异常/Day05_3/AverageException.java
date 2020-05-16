package 异常.Day05_3;

public class AverageException extends RuntimeException {
    public AverageException() {
    }

    public AverageException(String message) {
        super(message);
    }
}
