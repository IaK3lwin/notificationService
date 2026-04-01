package dev.message.magalu_challenge.domain.usecases.notification;

import dev.message.magalu_challenge.domain.exceptions.NotificationNoExistException;
import dev.message.magalu_challenge.domain.io.notification.NotificationOutput;
import dev.message.magalu_challenge.domain.mappers.NotificationMapper;
import dev.message.magalu_challenge.domain.usecases.repository.NotificationRepository;
import dev.message.magalu_challenge.domain.entities.Notification;

public class NotificationGetWitIdCase {
  private NotificationRepository repository;

  public NotificationGetWitIdCase(NotificationRepository repository) {
    this.repository = repository;
  }

  public NotificationOutput execute(Long id) {

    Notification notification = repository.getWithId(id);

    if (notification == null) {
      throw new NotificationNoExistException("notification with " + id + "don't exist", "Get notification case");

    }

    System.out.println(notification);
    return NotificationMapper.toOutput(notification);
  }

}
