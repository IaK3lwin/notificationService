package dev.message.magalu_challenge.domain.io.notification;

import java.time.LocalDateTime;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.io.channel.ChannelInput;
import dev.message.magalu_challenge.domain.io.channel.ChannelOutput;
import dev.message.magalu_challenge.domain.io.status.StatusInput;
import dev.message.magalu_challenge.domain.io.status.StatusOutput;

public record NotificationOutput (
    Long id,
    String destination,
    String message,
    LocalDateTime createDate,
    Status status,
    Channel channel) implements NotificationInput, NotificationOutputI{

  @Override
  public ChannelInput getChannel() {
    // TODO Auto-generated method stub
    return new ChannelOutput(channel.getId(), channel.getType());
  }

  @Override
  public LocalDateTime getCreateDate() {
    // TODO Auto-generated method stub
    return createDate;
  }

  @Override
  public String getDestination() {
    // TODO Auto-generated method stub
    return destination;
  }

  @Override
  public Long getId() {
    // TODO Auto-generated method stub
    return id;
  }

  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return message;
  }

  @Override
  public StatusInput getStatus() {
    // TODO Auto-generated method stub
    return new StatusOutput(status.getId(), status.getValue());
  }

}
