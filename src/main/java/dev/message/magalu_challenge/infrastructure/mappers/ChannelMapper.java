package dev.message.magalu_challenge.infrastructure.mappers;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.domain.io.channel.ChannelInput;
import dev.message.magalu_challenge.domain.io.channel.ChannelOutput;
import dev.message.magalu_challenge.infrastructure.persistence.models.ChannelModel;

public class ChannelMapper {
  public static ChannelModel toModel(Channel channel) {

    return new ChannelModel(
        channel.getId(),
        channel.getType());

  }

  public static Channel toDomain(ChannelModel model) {
    return new Channel(
        model.getId(),
        model.getType());
  }

  public static Channel outputToDomain(ChannelInput output) {
    return new Channel(
           output.getId(),
           output.getType()
    );
  }
}
