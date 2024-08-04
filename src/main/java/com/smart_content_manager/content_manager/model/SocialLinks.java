package com.smart_content_manager.content_manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class SocialLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String link;
    private String title;
    @ManyToOne
    private Contact contact;

}
