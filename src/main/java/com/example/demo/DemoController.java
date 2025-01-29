package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
  @GetMapping("/")
  public String home() {
    return "home1";  // Corresponds to a view named home (home.html or home.jsp)
  }
  @GetMapping("/home")
  public String home1() {
    return "Welcome to the Home Page!";
  }
}
