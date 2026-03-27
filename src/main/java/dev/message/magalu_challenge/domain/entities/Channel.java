package dev.message.magalu_challenge.domain.entities;

public class Channel {
  private Long id;
  private String type;

  public Channel(Long id, String type) {
    this.id = id;
    this.type = type;
  }

  public Long getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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

    public Channel toChannel() {
      return new Channel((long) id, value);
    }
  }

}
