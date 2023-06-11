package com.radike.porfolio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title1;
    private String title2;
    private String title3;
    private String image1;
    private String image2;
    private String icon;

}
