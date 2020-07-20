package club.banyuan.com.exceptions2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 11:10 上午
 */
public class MyException  extends   RuntimeException {

  public MyException(String message) {
    super(message);
  }

  @Override
  public String getMessage() {
    return super.getMessage();
  }

  @Override
  public String getLocalizedMessage() {
    return super.getLocalizedMessage();
  }

  @Override
  public synchronized Throwable getCause() {
    return super.getCause();
  }

  @Override
  public synchronized Throwable initCause(Throwable cause) {
    return super.initCause(cause);
  }
}
