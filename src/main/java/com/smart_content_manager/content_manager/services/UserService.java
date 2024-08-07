package com.smart_content_manager.content_manager.services;

import java.util.List;
import java.util.Optional;

import com.smart_content_manager.content_manager.model.User;

public interface UserService {
User savUser(User user);
Optional<User> getUserByUserId(String userId);
Optional<User> updateUser(User user);
public void  deleteUser(String userId);
boolean isUserExist(String userId);
boolean isUserExistByEmail(String email);
List<User>getAllUsers();
}
