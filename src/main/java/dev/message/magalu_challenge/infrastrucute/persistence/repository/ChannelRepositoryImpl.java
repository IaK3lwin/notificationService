package dev.message.magalu_challenge.infrastrucute.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.domain.usecases.repository.ChannelRepository;
import dev.message.magalu_challenge.infrastrucute.persistence.models.ChannelModel;

public class ChannelRepositoryImpl implements ChannelRepository {

  @Override
  public void save(Channel channel) {
    // TODO Auto-generated method stub

  }

  @Override
  public void update(Channel channel) {
    // TODO Auto-generated method stub

  }

}

interface ChannelRepoService extends JpaRepository<ChannelModel, Long> {

}
