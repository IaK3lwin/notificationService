package dev.message.magalu_challenge.infrastrucute.mappers;

import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.infrastrucute.persistence.models.StatusModel;

public class StatusMapper {
  public static StatusModel toModel(Status status) {
    return new StatusModel(
        status.getId(),
        status.getValue());
  }

  public static Status toDomain(StatusModel model) {
    return new Status(
        model.getId(),
        model.getType());
  }
}
