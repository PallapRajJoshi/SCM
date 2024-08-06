package com.smart_content_manager.content_manager.model;



import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegister {


   @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
 
    private String userId;

    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(length = 1000)
    private String about;
    private String phoneNumber;
    
    

 

}
