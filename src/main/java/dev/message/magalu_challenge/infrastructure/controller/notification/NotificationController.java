package dev.message.magalu_challenge.infrastructure.controller.notification;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.message.magalu_challenge.adapters.dtos.NotificationDTO;
import dev.message.magalu_challenge.domain.usecases.notification.NotificationCreateCase;
import dev.message.magalu_challenge.infrastructure.persistence.repository.NotificationRepositoryImpl;

@RestController
@RequestMapping("/notification")
public class NotificationController {

  final NotificationRepositoryImpl repository;

  public NotificationController(NotificationRepositoryImpl repository) {
    this.repository = repository;
  }

  @PostMapping
  public ResponseEntity<Void> scheldulerNotification(@RequestBody NotificationDTO notification) {

    NotificationCreateCase createNotifcationCase = new NotificationCreateCase(
        repository);

    createNotifcationCase.execute(notification);

    return ResponseEntity.accepted().build();
  }

  @GetMapping
  public ResponseEntity<Void> consultNotication() {
    return ResponseEntity.accepted().build();
  }

}
