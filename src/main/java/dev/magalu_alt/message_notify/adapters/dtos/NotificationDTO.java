package dev.magalu_alt.message_notify.adapters.dtos;

import java.time.LocalDateTime;

import dev.magalu_alt.message_notify.domain.entities.ChannelComunication;
import dev.magalu_alt.message_notify.domain.entities.NotificationStatus;

public record NotificationDTO(
    Long id, String destination, String message, LocalDateTime create, ChannelComunication channelComunication,
    NotificationStatus status) {
}
