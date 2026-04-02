package dev.message.magalu_challenge.infrastructure.scheduler_notification;

import dev.message.magalu_challenge.domain.usecases.notification.NotificationSendCase;
import dev.message.magalu_challenge.infrastructure.persistence.repository.NotificationRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class ScheduledNotification {
  Logger logger  = LoggerFactory.getLogger(ScheduledNotification.class);

  private NotificationRepositoryImpl repository;

  public ScheduledNotification(NotificationRepositoryImpl repository) {
    this.repository = repository;
  }

  @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
  public void runTasksNotification() {

    LocalDateTime hour = LocalDateTime.now();
    logger.info("Running at {}", hour);

    NotificationSendCase notificationSendCase = new NotificationSendCase(repository);

    notificationSendCase.execute(hour);
  }

}
