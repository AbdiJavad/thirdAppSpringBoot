package com.javad.thirdappspringboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private int id;
    private String country;
    private String city;
    private String alley;
    private int block;
    private int unit;
}
