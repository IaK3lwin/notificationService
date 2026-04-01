package dev.message.magalu_challenge.infrastructure.persistence.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_notification")
public class NotificationModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  public NotificationModel() {
  }

  public NotificationModel(Long id, String destination, String message, LocalDateTime createDate, StatusModel status,
      ChannelModel channel) {
    this.id = id;
    this.destination = destination;
    this.message = message;
    this.createDate = createDate;
    this.status = status;
    this.channel = channel;
  }

  String destination;
  String message;
  LocalDateTime createDate;

  @ManyToOne
  @JoinColumn(name = "status_id")
  StatusModel status;

  @ManyToOne
  @JoinColumn(name = "channel_id")
  ChannelModel channel;

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

  public StatusModel getStatus() {
    return status;
  }

  public void setStatus(StatusModel status) {
    this.status = status;
  }

  public ChannelModel getChannel() {
    return channel;
  }

  public void setChannel(ChannelModel channel) {
    this.channel = channel;
  }

}
