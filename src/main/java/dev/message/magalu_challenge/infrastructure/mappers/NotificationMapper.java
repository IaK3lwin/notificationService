package dev.message.magalu_challenge.infrastructure.mappers;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.io.notification.NotificationOutputI;
import dev.message.magalu_challenge.infrastructure.persistence.models.NotificationModel;

public class NotificationMapper {
  public static NotificationModel toModel(Notification notification) {

    return new NotificationModel(
        notification.getId(),
        notification.getDestination(),
        notification.getMessage(),
        notification.getCreateDate(),
        StatusMapper.toModel(notification.getStatus()),
        ChannelMapper.toModel(notification.getChannel()));

  }

  public static Notification toDomain(NotificationModel model) {
    return new Notification(
        model.getId(),
        model.getDestination(),
        model.getMessage(),
        model.getCreateDate(),
        StatusMapper.toDomain(model.getStatus()),
        ChannelMapper.toDomain(model.getChannel()));
  }

  public static Notification outputToDomain(NotificationOutputI output) {

    return new Notification(
            output.getId(),
            output.getDestination(),
            output.getMessage(),
            output.getCreateDate(),
            StatusMapper.outputToDomain(output.getStatus()),
            ChannelMapper.outputToDomain(output.getChannel())
            );

  }

}
