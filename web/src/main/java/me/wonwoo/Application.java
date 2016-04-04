package me.wonwoo;

import me.wonwoo.entity.Account;
import me.wonwoo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by wonwoo on 2016. 4. 4..
 */
@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Autowired
  private AccountRepository accountRepository;

  @Bean
  public CommandLineRunner commandLineRunner() {
    return args ->
      Arrays.asList(
        new Account("wonwoo", "123"),
        new Account("youngjin", "0000")
      ).forEach(accountRepository::save);

  }
}
