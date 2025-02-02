package com.example.demo.controller;

import com.example.demo.model.LoginRequest;
import com.example.demo.service.Impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

  @Autowired
  private UserServiceImpl _userService;

  @PostMapping("/login")
  public ResponseEntity<?> login( @RequestBody LoginRequest loginRequest) {
    boolean isAuthenticated = _userService.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword());

    if (isAuthenticated) {
      return ResponseEntity.ok("Login Successful");
    } else {
      return ResponseEntity.status( HttpStatus.UNAUTHORIZED).body( "Invalid Credentials");
    }
  }
}
