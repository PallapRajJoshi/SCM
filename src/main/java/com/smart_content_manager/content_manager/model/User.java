package com.smart_content_manager.content_manager.model;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name="user")
@Table(name="users")
public class User {
@Id
private String userId;
private String name;
private String email;
private String password;
private String about;
private String profilePic;
private String phoneNumber;
private boolean enabled=false;

private boolean emailVerified=false;
private boolean phoneVerified=false;
//self google etc
private Providers provider=Providers.SELF;
private String providerUserId;



}
