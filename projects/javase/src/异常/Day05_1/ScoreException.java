package 异常.Day05_1;

public class ScoreException extends RuntimeException {
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}
