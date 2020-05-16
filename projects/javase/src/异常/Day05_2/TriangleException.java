package 异常.Day05_2;

public class TriangleException extends RuntimeException {
    public TriangleException() {
    }

    public TriangleException(String message) {
        super(message);
    }
}
