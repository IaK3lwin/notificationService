package dev.message.magalu_challenge.infrastructure.controller.notification;

import java.util.Arrays;
import java.util.List;

import dev.message.magalu_challenge.domain.entities.Notification;
import dev.message.magalu_challenge.domain.io.notification.NotificationOutput;
import dev.message.magalu_challenge.domain.usecases.notification.NotificationCancellationCase;
import dev.message.magalu_challenge.domain.usecases.notification.NotificationGetWitIdCase;
import dev.message.magalu_challenge.infrastructure.mappers.NotificationMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.message.magalu_challenge.adapters.dtos.NotificationDTO;
import dev.message.magalu_challenge.domain.usecases.notification.NotificationConsultCase;
import dev.message.magalu_challenge.domain.usecases.notification.NotificationCreateCase;
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
        .map(NotificationMapper::toModel).toList();

    return ResponseEntity.ok(notificationsResult);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Notification> getWithId(@PathVariable("id") Long id) {
    NotificationGetWitIdCase getWithId = new NotificationGetWitIdCase(repository);

    NotificationOutput notification =  getWithId.execute(id);

    System.out.println(notification.getMessage());

    return ResponseEntity.ok(NotificationMapper.outputToDomain(notification));

  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> cancelNlNotification(@PathVariable("id") Long id) {
    NotificationCancellationCase notificationCancellationCase = new NotificationCancellationCase(repository);

    notificationCancellationCase.execute(id);

    return ResponseEntity.noContent().build();

  }

}
