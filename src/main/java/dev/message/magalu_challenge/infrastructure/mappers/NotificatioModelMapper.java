package dev.message.magalu_challenge.infrastructure.mappers;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.infrastructure.persistence.models.NotificationModel;

public class NotificatioModelMapper {
  public static NotificationModel toModel(Notification notification) {


    return new NotificationModel(
      notification.getId(), 
      notification.getDestination(), 
      notification.getMessage(), 
      notification.getCreateDate(), 
      notification.getStatus()
      , channel) 




  }
}
