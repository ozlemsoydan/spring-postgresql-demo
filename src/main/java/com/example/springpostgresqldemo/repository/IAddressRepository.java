package com.example.springpostgresqldemo.repository;

import com.example.springpostgresqldemo.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Adress, Long> {
}
