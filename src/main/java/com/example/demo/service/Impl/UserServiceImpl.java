package com.example.demo.service.Impl;

import com.example.demo.service.UserService;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService
{
    public boolean authenticateUser(String username, String password)
    {
        return false;
    }
}
