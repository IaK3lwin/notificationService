package dev.message.magalu_challenge.infrastructure.persistence.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import dev.message.magalu_challenge.domain.exceptions.NotificationNotFound;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.usecases.repository.NotificationRepository;
import dev.message.magalu_challenge.infrastructure.mappers.NotificationMapper;
import dev.message.magalu_challenge.infrastructure.persistence.models.NotificationModel;

@Repository
public class NotificationRepositoryImpl implements NotificationRepository {

  private final NotificationRepoService repository;

  public NotificationRepositoryImpl(NotificationRepoService repository) {
    this.repository = repository;
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub

  }

  @Override
  public Notification[] getAll() {
    // TODO Auto-generated method stub
    List<NotificationModel> notificationsModel = repository.findAll();

    Stream<Notification> notifications = notificationsModel.stream().map(NotificationMapper::toDomain);

    return notifications.toArray(Notification[]::new);
  }

  @Override
  public Notification getWithId(Long id) {

    Optional<NotificationModel> notificationModel = repository.findById(id);
    if (notificationModel.isEmpty()) {
      throw new NotificationNotFound("notificatonRepositoryImpl/getWithId()");
    }

    return NotificationMapper.toDomain(notificationModel.get());
  }

  @Override
  public Notification getWithMessage(String message) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void save(Notification notification) {
    // TODO Auto-generated method stub
    repository.save(NotificationMapper.toModel(notification));
  }

  @Override
  public void update(Notification notification) {
    // TODO Auto-generated method stub
    repository.save(NotificationMapper.toModel(notification));
  }
}

interface NotificationRepoService extends JpaRepository<NotificationModel, Long> {

}
