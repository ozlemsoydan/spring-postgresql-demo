package com.example.springpostgresqldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table ( name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",length = 100 ,nullable = true)
    private String userName;

    @Column(name = "surname", length = 100, nullable = true)
    private String surname;

    @Column(name = "phone_number" )
    private int number;

    @Column(name = "active")
    private boolean active;

    @OneToMany
    @JoinColumn(name = "adress_id")
    private List<Adress> adresses ;


}
