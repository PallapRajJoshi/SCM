package com.smart_content_manager.content_manager.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

   @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
 
    private String userId;

    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private String phoneNumber;
    private boolean enabled = false;

    private boolean emailVerified = false;
    private boolean phoneVerified = false;
//self google etc
    private Providers provider = Providers.SELF;
    private String providerUserId;

}
