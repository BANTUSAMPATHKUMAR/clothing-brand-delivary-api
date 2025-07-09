package com.clothing_brand_delivary.service;

import java.util.UUID;

import com.clothing_brand_delivary.entity.Product;

public interface ProductService {
	
	public void CreateProduct(Product product);
	
	public Product FetchProducts(UUID id);

}
