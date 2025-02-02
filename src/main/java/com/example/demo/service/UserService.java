package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService
{
  public boolean authenticateUser(String username, String password);
}
