package com.smart_content_manager.content_manager.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart_content_manager.content_manager.model.User;
import com.smart_content_manager.content_manager.repsitories.UserRepo;
import com.smart_content_manager.content_manager.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User savUser(User user) {
       return userRepo.save(user);
    }

    @Override
    public Optional<User> getUserByUserId(String userId) {

return userRepo.findById(userId);

    }

    @Override
    public Optional<User> updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User deleteUser(String userId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isUserExist(String userId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isUserExistByEmail(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<User> getAllUsers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    // Implementing user related services here
    // For example: createUser, updateUser, deleteUser, getUserById, etc.

}
