package com.example.demo.model;

import lombok.Getter;

@Getter
public class LoginRequest {

  // Getters and setters
  private String username;

  private String password;

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  // Constructor
  public LoginRequest() {}

  public LoginRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }
}
