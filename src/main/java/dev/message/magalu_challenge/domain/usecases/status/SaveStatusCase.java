package dev.message.magalu_challenge.domain.usecases.status;

import dev.message.magalu_challenge.domain.io.status.StatusInput;
import dev.message.magalu_challenge.domain.mappers.StatusMapper;
import dev.message.magalu_challenge.domain.usecases.repository.StatusRepository;

public class SaveStatusCase {
  private StatusRepository repository;

  public SaveStatusCase(StatusRepository repository) {
    this.repository = repository;
  }

  public void execute(StatusInput input) {
    repository.save(StatusMapper.toDomain(input));
  }

}
