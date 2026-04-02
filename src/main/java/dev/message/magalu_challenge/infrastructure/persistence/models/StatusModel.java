package dev.message.magalu_challenge.infrastructure.persistence.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")
public class StatusModel {
  @Id
  private Long id;
  private String type;

  public StatusModel() {
  }

  public StatusModel(Long id, String type) {
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
    DELIVERED((short) 1, "delivered"),
    PENDENT((short) 2, "pendent"),
    ERROR((short) 3, "error"),
    CANCELLED((short) 4, "canceled");

    private short id;
    private String type;

    Values(short id, String type) {
      this.id = id;
      this.type = type;
    }

    public StatusModel toStatus() {
      return new StatusModel((long) id, type);
    }

  }

}
