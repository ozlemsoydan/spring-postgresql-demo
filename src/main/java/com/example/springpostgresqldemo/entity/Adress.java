package com.example.springpostgresqldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "adress")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Adress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adress", length = 500, nullable = true)
    private String adress;

    @Column (name = "adress_type",nullable = true)
    private AdressType adressType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "adress_id")
    private Users user;
    enum AdressType {
        Home_Adress,
        Business_Adress,
        Other
    }

}
