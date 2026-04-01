package dev.message.magalu_challenge.domain.io.notification;

import java.time.LocalDateTime;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.io.channel.ChannelInput;
import dev.message.magalu_challenge.domain.io.status.StatusInput;

public record NotificationOutput(
    Long id,
    String destination,
    String message,
    LocalDateTime createDate,
    Status status,
    Channel channel) implements NotificationInput {

  @Override
  public ChannelInput getChannel() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LocalDateTime getCreateDate() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getDestination() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Long getId() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public StatusInput getStatus() {
    // TODO Auto-generated method stub
    return null;
  }

}
