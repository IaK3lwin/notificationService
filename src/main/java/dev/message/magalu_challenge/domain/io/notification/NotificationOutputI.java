package dev.message.magalu_challenge.domain.io.notification;

import dev.message.magalu_challenge.domain.io.channel.ChannelInput;
import dev.message.magalu_challenge.domain.io.status.StatusInput;

import java.time.LocalDateTime;

public interface NotificationOutputI {

  public ChannelInput getChannel();

  public LocalDateTime getSendDate();

  public String getDestination();

  public Long getId();

  public String getMessage();

  public StatusInput getStatus();
}
