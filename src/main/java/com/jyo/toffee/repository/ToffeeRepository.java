package com.jyo.toffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jyo.toffee.entities.Toffee;

public interface ToffeeRepository extends JpaRepository<Toffee, Integer> {

}
