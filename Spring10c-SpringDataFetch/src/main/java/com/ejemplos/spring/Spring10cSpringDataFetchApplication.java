package com.ejemplos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejemplos.spring.model.Company;
import com.ejemplos.spring.model.Product;
import com.ejemplos.spring.services.CompanyServices;
import com.ejemplos.spring.services.ProductServices;

@SpringBootApplication
public class Spring10cSpringDataFetchApplication implements CommandLineRunner{

	@Autowired
	CompanyServices companyServices;
	
	@Autowired
	ProductServices productServices;
	
	public static void main(String[] args) {
		SpringApplication.run(Spring10cSpringDataFetchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clearData();
		saveData();
		showData();		
	}

	private void clearData() {
		System.out.println("-------------------Clear DATA-------------------");
		companyServices.deleteAll();
		productServices.deleteAll();
	}

	private void saveData() {
		System.out.println("-------------------Save DATA-------------------");
		
		Product iphone7 = new Product("Iphone 7");
		Product ipadpro = new Product("IPadPro");
		Product galaxyJ7 = new Product("GalaxyJ7");
		Product galaxyTabA = new Product("GalaxyTabA");
		
		Company apple = new Company("Apple");
		Company samsung = new Company("Samsung");
		
		iphone7.setCompany(apple);
		ipadpro.setCompany(apple);
		galaxyJ7.setCompany(samsung);
		galaxyTabA.setCompany(samsung);
		
		companyServices.save(apple);
		companyServices.save(samsung);
		
		productServices.save(iphone7);
		productServices.save(ipadpro);
		productServices.save(galaxyJ7);
		productServices.save(galaxyTabA);
		
	}

	private void showData() {
		System.out.println("-------------------Show All DATA-------------------");		
		companyServices.showData();
		productServices.showData();
	}

}
