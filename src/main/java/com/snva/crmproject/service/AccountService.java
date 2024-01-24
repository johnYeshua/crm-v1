package com.snva.crmproject.service;

import java.util.Optional;

import com.snva.crmproject.entity.userDetails.User;

public interface AccountService {
    Optional<User> getAccountByUsername(String username);
    void deleteUserById(Long userId);
    // Add other methods as needed
}