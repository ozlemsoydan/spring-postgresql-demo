package com.example.springpostgresqldemo.dto;


import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private Long id;
    private String userName;
    private String surname;
    private int number;
    private List<String> addressList;

}
