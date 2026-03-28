package dev.message.magalu_challenge.infrastrucute.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.usecases.repository.StatusRepository;
import dev.message.magalu_challenge.infrastrucute.persistence.models.StatusModel;

public class StatusRepositoryImpl implements StatusRepository {

  @Override
  public void save(Status status) {
    // TODO Auto-generated method stub
    //

  }

  @Override
  public void update(Status status) {
    // TODO Auto-generated method stub

  }

}

interface StatusRepoService extends JpaRepository<StatusModel, Long> {

}
