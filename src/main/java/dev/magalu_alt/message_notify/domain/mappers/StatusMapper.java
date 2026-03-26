package dev.magalu_alt.message_notify.domain.mappers;

import dev.magalu_alt.message_notify.domain.entities.NotificationStatus;
import dev.magalu_alt.message_notify.domain.usecases.status.NotificationStatusAdapter;

public class StatusMapper {
  public static NotificationStatus toStatus(NotificationStatusAdapter input) {
    return new NotificationStatus(
        input.getId(), input.getValue());
  }
}
