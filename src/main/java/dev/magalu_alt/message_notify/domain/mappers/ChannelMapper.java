package dev.magalu_alt.message_notify.domain.mappers;

import dev.magalu_alt.message_notify.domain.usecases.channel.ChannelAdapter;
import dev.magalu_alt.message_notify.domain.entities.ChannelComunication;

public class ChannelMapper {
  public static ChannelComunication toChannel(ChannelAdapter input) {
    return new ChannelComunication(
        input.getId(),
        input.getDescription());
  }
}
