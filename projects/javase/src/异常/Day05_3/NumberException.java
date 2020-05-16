package 异常.Day05_3;

public class NumberException extends RuntimeException {
    public NumberException() {
    }

    public NumberException(String message) {
        super(message);
    }
}
