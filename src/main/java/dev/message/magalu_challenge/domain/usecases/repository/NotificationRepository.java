package dev.message.magalu_challenge.domain.usecases.repository;

import dev.message.magalu_challenge.domain.entities.Notification;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public interface NotificationRepository {
  public Notification getWithId(Long id);

  public Notification[] getAll();

  public void save(Notification notification);

  public void delete(Long id);

  public void update(Notification notification);

  public Notification getWithMessage(String message);

  List<Notification> getNotificationStatusPendentOrError(LocalDateTime hour);
}
