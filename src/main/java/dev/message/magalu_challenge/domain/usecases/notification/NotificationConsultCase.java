package dev.message.magalu_challenge.domain.usecases.notification;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.usecases.repository.NotificationRepository;

public class NotificationConsultCase {
  private NotificationRepository repository;

  public NotificationConsultCase(NotificationRepository repository) {
    this.repository = repository;
  }

  public Notification[] execute() {
    return repository.getAll();
  }
}
