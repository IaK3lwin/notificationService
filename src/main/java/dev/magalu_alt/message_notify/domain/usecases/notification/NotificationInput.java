package dev.magalu_alt.message_notify.domain.usecases.notification;

import java.time.LocalDateTime;

import dev.magalu_alt.message_notify.domain.usecases.channel.ChannelInput;
import dev.magalu_alt.message_notify.domain.usecases.status.NotificationStatusInput;

public interface NotificationInput {
  public Long getId();

  public LocalDateTime getCreateDate();

  public String getDestination();

  public ChannelInput getChannel();

  public NotificationStatusInput getStatus();

}
