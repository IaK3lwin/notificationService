package dev.message.magalu_challenge.domain.usecases.notification;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.exceptions.NotificationExistExecption;
import dev.message.magalu_challenge.domain.io.notification.NotificationInput;
import dev.message.magalu_challenge.domain.mappers.NotificationMapper;
import dev.message.magalu_challenge.domain.usecases.repository.NotificationRepository;

import java.time.LocalDateTime;

public class NotificationCreateCase {

  private NotificationRepository repository;

  public NotificationCreateCase(NotificationRepository repository) {
    this.repository = repository;
  }

  public void execute(NotificationInput input) {

    Notification notificationExist = repository.getWithMessage(input.getMessage());

    if (notificationExist != null && input.getId() == notificationExist.getId()) {
      throw new NotificationExistExecption("notificação com o mesmo conteúso já existe!",
          "create notification usecase");
    }
    Notification notificationUpdated = NotificationMapper.toDomain(input);

    notificationUpdated.setStatus(Status.Values.PENDENT.toStatus());

    notificationUpdated.setSendDate(LocalDateTime.now());

    repository.save(notificationUpdated);

  }
}
