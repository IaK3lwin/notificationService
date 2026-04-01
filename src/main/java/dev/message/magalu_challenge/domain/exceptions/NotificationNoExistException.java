
package dev.message.magalu_challenge.domain.exceptions;

public class NotificationNoExistException extends ExceptionStardard {

  public NotificationNoExistException(String message, String path) {
    super(message, path, (short) 404);
  }

  @Override
  public String getMessage() {
    return super.getMessage();
  }
}
