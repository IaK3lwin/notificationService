package dev.message.magalu_challenge.adapters.dtos;

import dev.message.magalu_challenge.domain.io.channel.ChannelInput;

public record ChannelDTO(
    Long id,
    String type) implements ChannelInput {

  @Override
  public Long getId() {
    // TODO Auto-generated method stub
    return id;
  }

  @Override
  public String getType() {
    // TODO Auto-generated method stub
    return type;
  }

  public enum Values {
    WHATSAPP((short) 1, "whatsapp"),
    SMS((short) 2, "sms"),
    PUSH((short) 3, "push"),
    EMAIL((short) 4, "email");

    private short id;
    private String value;

    Values(short id, String value) {
      this.id = id;
      this.value = value;
    }

    public ChannelDTO toChannel() {
      return new ChannelDTO((long) id, value);
    }
  }

}
