package dev.message.magalu_challenge.domain.entities;

public class Status {
  private Long id;
  private String value;

  public Status(Long id, String value) {
    this.id = id;
    this.value = value;
  }

  public Long getId() {
    return id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public enum Values {
    DELIVERED((short) 1, "delivered"),
    PENDENT((short) 2, "pending"),
    ERROR((short) 3, "error"),
    CANCELLED((short) 4, "canceled");

    private short id;
    private String value;

    Values(short id, String value) {
      this.id = id;
      this.value = value;
    }

    public Status toStatus() {
      return new Status((long) id, value);
    }

  }
}
