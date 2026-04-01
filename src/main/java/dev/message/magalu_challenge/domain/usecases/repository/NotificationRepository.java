package dev.message.magalu_challenge.domain.usecases.repository;

import dev.message.magalu_challenge.domain.entities.Notification;


public interface NotificationRepository {
  public Notification getWithId(Long id);

  public Notification[] getAll();

  public void save(Notification notification);

  public void delete(Long id);

  public void update(Notification notification);

  public Notification getWithMessage(String message);
}
