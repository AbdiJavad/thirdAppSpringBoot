package com.javad.thirdappspringboot.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity
@Table(name = "custo")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    private long phone;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

}
