package com.clothing_brand_delivary.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clothing_brand_delivary.entity.Product;
import com.clothing_brand_delivary.serviceimpl.ProductServiceImpl;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@PostMapping("/CreateProduct")
	public void CreateProduct(@RequestBody Product product) {
		productServiceImpl.CreateProduct(product);
		
	}

	@GetMapping("/FetchProduct/{id}")
	public Product FetchProducts(@PathVariable UUID id) {
		return productServiceImpl.FetchProducts(id);
	}
}
