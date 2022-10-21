package com.radike.porfolio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class SocialLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String github;
    private String codepen;
    private String linkedin;
    private String email;
    private String twitter;
    private String devto;

}
