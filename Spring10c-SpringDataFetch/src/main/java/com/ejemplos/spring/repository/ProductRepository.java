package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplos.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
