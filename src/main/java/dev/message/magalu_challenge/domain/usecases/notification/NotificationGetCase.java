package dev.message.magalu_challenge.domain.usecases.notification;

import dev.message.magalu_challenge.domain.io.notification.NotificationOutput;
import dev.message.magalu_challenge.domain.mappers.NotificationMapper;
import dev.message.magalu_challenge.domain.usecases.repository.NotificationRepository;

public class NotificationGetCase {
  private NotificationRepository repository;

  public NotificationGetCase(NotificationRepository repository) {
    this.repository = repository;
  }

  public NotificationOutput execute(Long id) {
    return NotificationMapper.toOutput(repository.getWithId(id));
  }

}
