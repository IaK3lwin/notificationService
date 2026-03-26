package dev.magalu_alt.message_notify.domain.entities;

public class ChannelComunication {
  private Long id;
  private String description;

  public ChannelComunication() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
