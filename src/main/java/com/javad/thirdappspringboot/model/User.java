package com.javad.thirdappspringboot.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@Table(name = "client")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String firstname;
    private String lastname;
}
