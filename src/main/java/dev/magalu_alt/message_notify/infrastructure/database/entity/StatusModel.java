package dev.magalu_alt.message_notify.infrastructure.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")
public class StatusModel {
  @Id
  private Long id;
  private String value;

  public StatusModel() {
  }

  public Long getId() {
    return id;
  }

  public String getValue() {
    return value;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
