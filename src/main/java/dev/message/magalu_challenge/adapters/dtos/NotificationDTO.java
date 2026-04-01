package dev.message.magalu_challenge.adapters.dtos;

import java.time.LocalDateTime;

import dev.message.magalu_challenge.domain.io.channel.ChannelInput;
import dev.message.magalu_challenge.domain.io.notification.NotificationInput;
import dev.message.magalu_challenge.domain.io.notification.NotificationOutputI;
import dev.message.magalu_challenge.domain.io.status.StatusInput;

public record NotificationDTO(
    Long id,
    String destination,
    String message,
    LocalDateTime createDate,
    StatusDTO status,
    ChannelDTO channel)  implements NotificationInput, NotificationOutputI {

  @Override
  public ChannelInput getChannel() {
    // TODO Auto-generated method stub
    return channel;
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
    return status;
  }

}
