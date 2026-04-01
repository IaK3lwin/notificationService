package dev.message.magalu_challenge.infrastructure.mappers;

import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.io.status.StatusInput;
import dev.message.magalu_challenge.domain.io.status.StatusOutput;
import dev.message.magalu_challenge.infrastructure.persistence.models.StatusModel;

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

  public static Status outputToDomain(StatusInput output) {
    return new Status(
            output.getId(),
            output.getValue()
    );
  }
}
