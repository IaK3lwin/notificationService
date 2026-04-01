package dev.message.magalu_challenge.domain.io.status;

public record StatusOutput(
    Long id,
    String value) implements  StatusInput {
  @Override
  public Long getId() {
    return id;
  }

  @Override
  public String getValue() {
    return value;
  }
}
