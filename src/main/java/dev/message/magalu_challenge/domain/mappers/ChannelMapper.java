package dev.message.magalu_challenge.domain.mappers;

import dev.message.magalu_challenge.domain.entities.Channel;
import dev.message.magalu_challenge.domain.io.channel.ChannelInput;
import dev.message.magalu_challenge.domain.io.channel.ChannelOutput;

public class ChannelMapper {
  public static Channel toDomain(ChannelInput input) {
    return new Channel(
        input.getId(),
        input.getType());

  }

  public static ChannelOutput toOutput(Channel channel) {

    return new ChannelOutput(channel.getId(), channel.getType());

  }
}
