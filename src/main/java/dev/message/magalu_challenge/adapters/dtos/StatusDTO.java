package dev.message.magalu_challenge.adapters.dtos;

import dev.message.magalu_challenge.domain.io.status.StatusInput;

public record StatusDTO(
    Long id,
    String value) implements StatusInput {

  @Override
  public Long getId() {
    // TODO Auto-generated method stub
    return id;
  }

  @Override
  public String getValue() {
    // TODO Auto-generated method stub
    return value;
  }

  public enum Values {
    DELIVERED((short) 1, "delivered"),
    PENDENT((short) 2, "pendent"),
    ERROR((short) 3, "error"),
    CANCELLED((short) 4, "cancelled");

    private short id;
    private String value;

    Values(short id, String value) {
      this.id = id;
      this.value = value;
    }

    public StatusDTO toStatus() {
      return new StatusDTO((long) id, value);
    }

  }
}
