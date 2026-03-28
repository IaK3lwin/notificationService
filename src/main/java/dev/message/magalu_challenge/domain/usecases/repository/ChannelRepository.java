package dev.message.magalu_challenge.domain.usecases.repository;

import dev.message.magalu_challenge.domain.entities.Channel;

public interface ChannelRepository {
  public void save(Channel channel);

  public void update(Channel channel);
}
