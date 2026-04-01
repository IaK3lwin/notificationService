package dev.message.magalu_challenge.domain.mappers;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.io.notification.NotificationInput;
import dev.message.magalu_challenge.domain.io.notification.NotificationOutput;

public class NotificationMapper {
  public static Notification toDomain(NotificationInput input) {

    Status status = StatusMapper.toDomain(input.getStatus());
    // TODO: corrigir implementação do criação do channel
    Channel channel = ChannelMapper.toDomain(input.getChannel());

    return new Notification(input.getId(), input.getDestination(),
        input.getMessage(), input.getCreateDate(),
        status, channel);

  }

  public static NotificationOutput toOutput(Notification notification) {
    return new NotificationOutput(
        notification.getId(),
        notification.getDestination(),
        notification.getMessage(),
        notification.getCreateDate(),
        notification.getStatus(),
        notification.getChannel());
  }
}
