package dev.message.magalu_challenge.domain.exceptions;

public class NotificationNotFound extends ExceptionStardard {
  public NotificationNotFound( String path) {
    super("Notification not found in system", path, (short) 404);
  }
}
