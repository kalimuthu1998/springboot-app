package com.example.demo.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; // Primary key, auto-incremented in the database

  @Column(nullable = false, unique = true)
  private String username; // Unique username for login

  @Column(nullable = false, unique = true)
  private String email; // Unique email address

  @Column(nullable = false)
  private String password; // Hashed password

  private String firstName; // User's first name

  private String lastName; // User's last name

  private String role = "user"; // Default role set to 'user'

  @Column(name = "created_at", updatable = false)
  private LocalDateTime createdAt = LocalDateTime.now(); // Account creation time

  @Column(name = "updated_at")
  private LocalDateTime updatedAt = LocalDateTime.now(); // Last updated time

  private boolean isActive = true; // Account status, defaults to active

  private String profilePicture; // URL of the user's profile picture (optional)

  private String address; // User's address (optional)

  private String phoneNumber; // User's contact number (optional)

  private LocalDateTime lastLogin; // Last login time (optional)

  private String resetToken; // Token for password reset (optional)


  public void setId(Long id) {
    this.id = id;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }


  public void setProfilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
  }


  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public void setLastLogin(LocalDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }

}
