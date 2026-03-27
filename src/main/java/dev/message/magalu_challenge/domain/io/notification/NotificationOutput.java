package dev.message.magalu_challenge.domain.io.notification;

import java.time.LocalDateTime;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.domain.entities.Status;

public record NotificationOutput(
    Long id,
    String destination,
    String message,
    LocalDateTime createDate,
    Status status,
    Channel channel) {
}
