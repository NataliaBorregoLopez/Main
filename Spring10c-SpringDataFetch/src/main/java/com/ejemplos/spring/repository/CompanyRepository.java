package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplos.spring.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
