package dev.message.magalu_challenge.adapters.dtos;

import java.time.LocalDateTime;

public record NotificationDTO(
    Long id,
    String destination,
    String message,
    LocalDateTime createDate,
    StatusDTO status,
    ChannelDTO channel) {
}
