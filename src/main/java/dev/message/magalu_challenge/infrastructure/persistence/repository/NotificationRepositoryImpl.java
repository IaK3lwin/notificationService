package dev.message.magalu_challenge.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.usecases.repository.NotificationRepository;
import dev.message.magalu_challenge.infrastructure.persistence.models.NotificationModel;

@Repository
public class NotificationRepositoryImpl implements NotificationRepository {

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub

  }

  @Override
  public Notification[] getAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Notification getWithId(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Notification getWithMessage(String message) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void save(Notification notification) {
    // TODO Auto-generated method stub

  }

  @Override
  public void update(Notification notification) {
    // TODO Auto-generated method stub

  }
}

interface NotificationRepoService extends JpaRepository<NotificationModel, Long> {

}
