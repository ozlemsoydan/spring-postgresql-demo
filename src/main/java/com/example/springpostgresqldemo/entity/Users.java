package com.example.springpostgresqldemo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
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

    @Column(name = "create_date")
    private Date createDate;

    @OneToMany
    @JoinColumn(name = "adress_id")
    private List<Adress> adresses ;


}
