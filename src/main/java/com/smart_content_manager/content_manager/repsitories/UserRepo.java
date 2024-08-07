package com.smart_content_manager.content_manager.repsitories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart_content_manager.content_manager.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, String> {


Optional<User> findByEmail(String email);
Optional<User> findByEmailAndPassword(String email,String password);

}
