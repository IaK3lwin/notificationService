package dev.magalu_alt.message_notify.domain.entities;

import java.time.LocalDateTime;

public class Notification {
  private Long id;
  private String destination;
  private String message;
  private LocalDateTime createDate;
  private ChannelComunication channel;
  private NotificationStatus status;

  public Notification(Long id, String destination, String message, LocalDateTime createDate,
      ChannelComunication channel,
      NotificationStatus status) {
    this.id = id;
    this.destination = destination;
    this.message = message;
    this.createDate = createDate;
    this.channel = channel;
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public LocalDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }

  public ChannelComunication getChannel() {
    return channel;
  }

  public void setChannel(ChannelComunication channel) {
    this.channel = channel;
  }

  public NotificationStatus getStatus() {
    return status;
  }

  public void setStatus(NotificationStatus status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
