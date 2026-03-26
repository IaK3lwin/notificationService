package dev.magalu_alt.message_notify.domain.usecases.notification;

import java.time.LocalDateTime;

import dev.magalu_alt.message_notify.domain.usecases.channel.ChannelAdapter;
import dev.magalu_alt.message_notify.domain.usecases.status.NotificationStatusAdapter;

public interface NotificationAdapter {
  public Long getId();

  public LocalDateTime getCreateDate();

  public String getDestination();

  public String getMessage();

  public ChannelAdapter getChannel();

  public NotificationStatusAdapter getStatus();

}
