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
    LocalDateTime sendDate,
    StatusDTO status,
    ChannelDTO channel)  implements NotificationInput, NotificationOutputI {

  @Override
  public ChannelInput getChannel() {
    return channel;
  }

  @Override
  public LocalDateTime getSendDate() {
    return sendDate;
  }

  @Override
  public String getDestination() {
    return destination;
  }

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public StatusInput getStatus() {
    return status;
  }

}
