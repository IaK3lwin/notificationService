package dev.message.magalu_challenge.domain.io.notification;

import java.time.LocalDateTime;

import dev.message.magalu_challenge.domain.io.channel.ChannelInput;
import dev.message.magalu_challenge.domain.io.status.StatusInput;

public interface NotificationInput {
  public Long getId();

  public String getDestination();

  public String getMessage();

  public LocalDateTime getSendDate();

  public StatusInput getStatus();

  public ChannelInput getChannel();
}
