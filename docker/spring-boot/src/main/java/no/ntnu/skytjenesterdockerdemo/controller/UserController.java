package no.ntnu.skytjenesterdockerdemo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import no.ntnu.skytjenesterdockerdemo.models.User;
import no.ntnu.skytjenesterdockerdemo.repositories.UserRepository;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

  private final UserRepository userRepository;
  
  @GetMapping
  public ResponseEntity<List<User>> getAllUsers() {
    return ResponseEntity.ok(userRepository.findAll());
  }
}
