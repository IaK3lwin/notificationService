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

  String destination;
  String message;
  LocalDateTime sendDate;

  @ManyToOne
  @JoinColumn(name = "status_id")
  StatusModel status;

  @ManyToOne
  @JoinColumn(name = "channel_id")
  ChannelModel channel;

  public NotificationModel() {
  }

  public NotificationModel(Long id, String destination, String message, LocalDateTime createDate, StatusModel status,
                           ChannelModel channel) {
    this.id = id;
    this.destination = destination;
    this.message = message;
    this.sendDate = createDate;
    this.status = status;
    this.channel = channel;
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

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LocalDateTime getSendDate() {
    return sendDate;
  }

  public void setSendDate(LocalDateTime createDate) {
    this.sendDate = createDate;
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
