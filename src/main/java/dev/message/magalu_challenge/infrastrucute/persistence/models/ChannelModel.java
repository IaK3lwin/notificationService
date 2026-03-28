package dev.message.magalu_challenge.infrastrucute.persistence.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_channel")
public class ChannelModel {
  @Id
  private Long id;
  private String type;

  public ChannelModel() {
  }

  public ChannelModel(Long id, String type) {
    this.id = id;
    this.type = type;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
    private String type;

    Values(short id, String type) {
      this.id = id;
      this.type = type;
    }

    public ChannelModel toChannel() {
      return new ChannelModel((long) id, type);
    }

  }

}
