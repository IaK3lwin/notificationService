package dev.message.magalu_challenge.domain.io.channel;

public record ChannelOutput (
    Long id,
    String type) implements ChannelInput {

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public String getType() {
    return type;
  }
}
