package com.ejemplos.spring.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Company;
import com.ejemplos.spring.repository.CompanyRepository;

@Service
public class CompanyServices {

	@Autowired
	CompanyRepository companyRepository;
	
	public void save(Company company) {
		companyRepository.save(company);
	}
	
	@Transactional
	public void showData() {
		System.out.println("------------------Retrives Company from Database:------------------");
		List<Company> companyList = companyRepository.findAll();
		System.out.println("------------------Show All Company on Console:------------------");
		companyList.forEach(System.out::println);
	}
	
	public void deleteAll() {
		companyRepository.deleteAll();
	}
	
}
