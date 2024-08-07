package com.smart_content_manager.content_manager.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart_content_manager.content_manager.helpers.ResourceNotFoundException;
import com.smart_content_manager.content_manager.model.User;
import com.smart_content_manager.content_manager.repsitories.UserRepo;
import com.smart_content_manager.content_manager.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User savUser(User user) {
        //user id:have to generate 
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        //encoding password:password
        user.setPassword(userId);
        return userRepo.save(user);
    }

    @Override
    public Optional<User> getUserByUserId(String userId) {

        return userRepo.findById(userId);

    }

    @Override
    public Optional<User> updateUser(User user) {
        User user1 = userRepo.findById(user.getUserId()).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        //

        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setAbout(user.getAbout());
        user1.setPassword(user.getPassword());
        user1.setPhoneNumber(user.getPhoneNumber());
        user.setProfilePic(user.getProfilePic());
        user1.setEmailVerified(user.isEmailVerified());
        user1.setPhoneVerified(user.isPhoneVerified());
        user1.setProvider(user.getProvider());
        user1.setProviderUserId(user.getProviderUserId());

        user.setEnabled(user.isEnabled());
        User save = userRepo.save(user1);
        return Optional.ofNullable(save);

    }

    @Override
    public void deleteUser(String userId) {
        User user1 = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        userRepo.delete(user1);
        //
   
   
    }

    @Override
    public boolean isUserExist(String userId) {
        User user1 = userRepo.findById(userId).orElse(null);
    
    return user1 != null ? true:false;
    
    }

    @Override
    public boolean isUserExistByEmail(String email) {
        User usr=  userRepo.findByEmail(email).orElse(null);
        return usr != null ? true:false;
    }

    @Override
    public List<User> getAllUsers() {
   return userRepo.findAll();
}
    // Implementing user related services here
    // For example: createUser, updateUser, deleteUser, getUserById, etc.

}
