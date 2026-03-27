package dev.message.magalu_challenge.domain.mappers;

import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.io.status.StatusInput;
import dev.message.magalu_challenge.domain.io.status.StatusOutput;

public class StatusMapper {
  public static Status toDomain(StatusInput input) {
    return new Status(
        input.getId(),
        input.getValue());
  }

  public static StatusOutput toOutput(Status status) {

    return new StatusOutput(
        status.getId(),
        status.getValue());

  }
}
