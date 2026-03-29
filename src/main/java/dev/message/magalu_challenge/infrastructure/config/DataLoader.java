package dev.message.magalu_challenge.infrastructure.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import dev.message.magalu_challenge.infrastructure.mappers.ChannelMapper;
import dev.message.magalu_challenge.infrastructure.mappers.StatusMapper;
import dev.message.magalu_challenge.infrastructure.persistence.models.ChannelModel;
import dev.message.magalu_challenge.infrastructure.persistence.models.StatusModel;
import dev.message.magalu_challenge.infrastructure.persistence.repository.ChannelRepositoryImpl;
import dev.message.magalu_challenge.infrastructure.persistence.repository.StatusRepositoryImpl;

@Configuration
public class DataLoader implements CommandLineRunner {

  private final StatusRepositoryImpl statusRepository;

  private final ChannelRepositoryImpl channelRepository;

  public DataLoader(StatusRepositoryImpl statusRepository, ChannelRepositoryImpl channelRepository) {
    this.statusRepository = statusRepository;
    this.channelRepository = channelRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    // TODO Auto-generated method stub

    Arrays.stream(ChannelModel.Values.values())
        .map(ChannelModel.Values::toChannel)
        .map(ChannelMapper::toDomain)
        .forEach(channelRepository::save);

    Arrays.stream(StatusModel.Values.values())
        .map(StatusModel.Values::toStatus)
        .map(StatusMapper::toDomain)
        .forEach(statusRepository::save);

  }

}
