package dev.message.magalu_challenge.domain.exceptions;

public class NotificationNotFound extends RuntimeException {
  public NotificationNotFound(String message) {
    super(message);
  }
}
