package com.example.springpostgresqldemo.repository;

import com.example.springpostgresqldemo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<Users,Long> {



}
