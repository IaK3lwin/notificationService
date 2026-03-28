package dev.message.magalu_challenge.infrastrucute.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.message.magalu_challenge.domain.entities.Status;
import dev.message.magalu_challenge.domain.usecases.repository.StatusRepository;
import dev.message.magalu_challenge.infrastrucute.mappers.StatusMapper;
import dev.message.magalu_challenge.infrastrucute.persistence.models.StatusModel;

interface StatusRepoService extends JpaRepository<StatusModel, Long> {

}

@Repository
public class StatusRepositoryImpl implements StatusRepository {

  private final StatusRepoService service;

  public StatusRepositoryImpl(StatusRepoService service) {
    this.service = service;
  }

  @Override
  public void save(Status status) {
    // TODO Auto-generated method stub
    service.save(StatusMapper.toModel(status));
  }

  @Override
  public void update(Status status) {
    // TODO Auto-generated method stub
    service.save(StatusMapper.toModel(status));
  }
}
