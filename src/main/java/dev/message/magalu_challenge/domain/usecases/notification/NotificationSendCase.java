package dev.message.magalu_challenge.domain.usecases.notification;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.usecases.repository.NotificationRepository;

import java.time.LocalDateTime;
import java.util.List;

public class NotificationSendCase {
  private final NotificationRepository repository;

  public NotificationSendCase(NotificationRepository repository) {
    this.repository = repository;
  }

  public void execute(LocalDateTime date) {
    List<Notification> notificationsPendentOrErros = repository.getNotificationStatusPendentOrError(date);

    notificationsPendentOrErros.forEach(notification -> {
      //TODO: implements Send Notification's logic

      notification.setStatus(Status.Values.DELIVERED.toStatus());

      System.out.println("Atualizado e enviado a notificação: " + notification.toString());

      repository.save(notification);
    });


  }
}
