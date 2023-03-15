package com.example.springpostgresqldemo.controller;

import com.example.springpostgresqldemo.dto.UserDto;
import com.example.springpostgresqldemo.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private IUserService userService;


    @PostMapping("/save")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.save(userDto));
    }

    @GetMapping("/list")
    public ResponseEntity<List<UserDto>> getAll(){
        return  ResponseEntity.ok(userService.getAll());
    }
}
