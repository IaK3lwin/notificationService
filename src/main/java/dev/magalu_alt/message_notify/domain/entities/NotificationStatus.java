package dev.magalu_alt.message_notify.domain.entities;

public class NotificationStatus {
  private Long id;
  private String value;

  public NotificationStatus() {
  }

  public NotificationStatus(Long id, String value) {
    this.id = id;
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Long getId() {
    return id;
  }

}
