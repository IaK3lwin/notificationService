package dev.magalu_alt.message_notify.domain.mappers;

import dev.magalu_alt.message_notify.domain.entities.ChannelComunication;
import dev.magalu_alt.message_notify.domain.entities.Notification;
import dev.magalu_alt.message_notify.domain.entities.NotificationStatus;
import dev.magalu_alt.message_notify.domain.usecases.notification.NotificationAdapter;

public class NotificationMapper {
  public static Notification toNotification(NotificationAdapter input) {

    NotificationStatus status = StatusMapper.toStatus(input.getStatus());
    ChannelComunication channel = ChannelMapper.toChannel(input.getChannel());

    return new Notification(

        input.getId(),
        input.getDestination(),
        input.getCreateDate(),
        channel,
        status);
  }

}
