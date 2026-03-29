package dev.message.magalu_challenge.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.domain.usecases.repository.ChannelRepository;
import dev.message.magalu_challenge.infrastructure.mappers.ChannelMapper;
import dev.message.magalu_challenge.infrastructure.persistence.models.ChannelModel;

interface ChannelRepoService extends JpaRepository<ChannelModel, Long> {

}

@Repository
public class ChannelRepositoryImpl implements ChannelRepository {

  private final ChannelRepoService service;

  public ChannelRepositoryImpl(ChannelRepoService service) {
    this.service = service;
  }

  public void save(Channel channel) {
    // TODO Auto-generated method stub
    service.save(ChannelMapper.toModel(channel));
  }

  @Override
  public void update(Channel channel) {
    // TODO Auto-generated method stub
    service.save(ChannelMapper.toModel(channel));

  }

}
