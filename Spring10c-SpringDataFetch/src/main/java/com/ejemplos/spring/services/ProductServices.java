package com.ejemplos.spring.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Product;
import com.ejemplos.spring.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServices {
	
	@Autowired
	ProductRepository productRepository;
	
	public void save(Product product) {
		productRepository.save(product);
	}
	
	@Transactional
	public void showData() {
		System.out.println("------------------Retrives Product from Database:------------------");
		List<Product> productList = productRepository.findAll();
		System.out.println("------------------Show All Products on Console:------------------");
		productList.forEach(System.out::println);
	}
	
	public void deleteAll() {
		productRepository.deleteAll();
	}
}
