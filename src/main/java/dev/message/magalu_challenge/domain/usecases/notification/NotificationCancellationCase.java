package dev.message.magalu_challenge.domain.usecases.notification;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.usecases.repository.NotificationRepository;

public class NotificationCancellationCase {
  private NotificationRepository repository;

  public NotificationCancellationCase(NotificationRepository repository) {
    this.repository = repository;
  }

  public void execute(Long id) {

    Notification notificationOld = repository.getWithId(id);

    notificationOld.setStatus(Status.Values.CANCELLED.toStatus());

    repository.update(notificationOld);

  }
}
