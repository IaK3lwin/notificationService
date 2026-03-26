package dev.magalu_alt.message_notify.infrastructure.database.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_notificaiton")
public class NotificationModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String message;
  private LocalDateTime dateTime;
  private String destination;

  @ManyToOne
  @JoinColumn(name = "channel_id")
  private ChannelModel channel;
  @ManyToOne
  @JoinColumn(name = "status_id")
  private StatusModel status;

  public NotificationModel() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public ChannelModel getChannel() {
    return channel;
  }

  public void setChannel(ChannelModel channel) {
    this.channel = channel;
  }

  public StatusModel getStatus() {
    return status;
  }

  public void setStatus(StatusModel status) {
    this.status = status;
  }

}
