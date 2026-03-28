package dev.message.magalu_challenge.domain.usecases.channel;

import dev.message.magalu_challenge.domain.io.channel.ChannelInput;
import dev.message.magalu_challenge.domain.mappers.ChannelMapper;
import dev.message.magalu_challenge.domain.usecases.repository.ChannelRepository;

public class SaveChannelCase {
  private ChannelRepository repository;

  public SaveChannelCase(ChannelRepository repository) {
    this.repository = repository;
  }

  public void execute(ChannelInput input) {
    repository.save(ChannelMapper.toDomain(input));
  }

}
