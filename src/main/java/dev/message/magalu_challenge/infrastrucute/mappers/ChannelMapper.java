package dev.message.magalu_challenge.infrastrucute.mappers;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.infrastrucute.persistence.models.ChannelModel;

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
}
