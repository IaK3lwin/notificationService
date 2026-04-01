package dev.message.magalu_challenge.infrastructure.controller.notification;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.message.magalu_challenge.adapters.dtos.NotificationDTO;
import dev.message.magalu_challenge.domain.usecases.notification.NotificationConsultCase;
import dev.message.magalu_challenge.domain.usecases.notification.NotificationCreateCase;
import dev.message.magalu_challenge.infrastructure.mappers.NotificatioModelMapper;
import dev.message.magalu_challenge.infrastructure.persistence.models.NotificationModel;
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
  public ResponseEntity<List<NotificationModel>> consultNotication() {
    NotificationConsultCase consultCase = new NotificationConsultCase(repository);

    List<NotificationModel> notificationsResult = Arrays.stream(consultCase.execute())
        .map(NotificatioModelMapper::toModel).toList();

    return ResponseEntity.ok(notificationsResult);
  }

  @GetMapp("/{id}")
  public ResponseEntity getWithId(@PathVariable("id") Long id) {


  }

}
