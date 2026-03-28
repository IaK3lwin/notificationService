package dev.message.magalu_challenge.domain.usecases.repository;

import dev.message.magalu_challenge.domain.entities.Status;

public interface StatusRepository {
  public void save(Status status);

  public void update(Status status);
}
