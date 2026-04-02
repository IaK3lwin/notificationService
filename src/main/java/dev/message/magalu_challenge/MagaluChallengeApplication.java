package dev.message.magalu_challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MagaluChallengeApplication {

  public static void main(String[] args) {
    SpringApplication.run(MagaluChallengeApplication.class, args);
  }

}
