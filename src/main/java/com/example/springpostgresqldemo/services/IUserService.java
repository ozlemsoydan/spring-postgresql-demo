package com.example.springpostgresqldemo.services;

import com.example.springpostgresqldemo.dto.UserDto;
import com.example.springpostgresqldemo.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {

    UserDto save(UserDto userDto);
    void delete(Long id);
    List <UserDto> getAll();
    UserDto update(UserDto userDto);
}
