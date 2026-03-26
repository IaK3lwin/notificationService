package dev.magalu_alt.message_notify.infrastructure.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_channel")
public class ChannelModel {

  @Id
  private Long id;

  private String content;

  public ChannelModel() {
  }

  public Long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
