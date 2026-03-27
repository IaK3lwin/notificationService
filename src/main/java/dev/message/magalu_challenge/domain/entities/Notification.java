package dev.message.magalu_challenge.domain.entities;

import java.time.LocalDateTime;

public class Notification {
  private Long id;
  private String destination;
  private String message;
  private LocalDateTime createDate;
  private Status status;
  private Channel channel;

  public Notification(Long id, String destination, String message, LocalDateTime createDate, Status status,
      Channel channel) {
    this.id = id;
    this.destination = destination;
    this.message = message;
    this.createDate = createDate;
    this.status = status;
    this.channel = channel;
  }

  public Long getId() {
    return id;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LocalDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

}
