package dev.message.magalu_challenge.infrastrucute.persistence.models;

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
  LocalDateTime createDate;

  @ManyToOne
  @JoinColumn(name = "status_id")
  StatusModel status;

  @ManyToOne
  @JoinColumn(name = "channel_id")
  ChannelModel channel;

}
