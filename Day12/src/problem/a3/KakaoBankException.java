package problem.a3;

public class KakaoBankException extends Exception {

  public KakaoBankException() {
    super();
  }

  public KakaoBankException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public KakaoBankException(String message, Throwable cause) {
    super(message, cause);
  }

  public KakaoBankException(String message) {
    super(message);
  }

  public KakaoBankException(Throwable cause) {
    super(cause);
  }

}
