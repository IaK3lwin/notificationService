package dev.magalu_alt.message_notify.domain.mappers;

import dev.magalu_alt.message_notify.domain.entities.NotificationStatus;
import dev.magalu_alt.message_notify.domain.usecases.status.NotificationStatusInput;

public class StatusMapper {
  public static NotificationStatus toStatus(NotificationStatusInput input) {
    return new NotificationStatus(
        input.getId(), input.getValue());
  }
}
