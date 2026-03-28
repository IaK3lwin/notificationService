package dev.message.magalu_challenge.domain.exceptions;

public class NotificationExistExecption extends ExceptionStardard {

  public NotificationExistExecption(String message, String path) {
    super(message, path);
  }

  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return super.getMessage();
  }

}
