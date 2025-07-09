package com.clothing_brand_delivary.serviceimpl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothing_brand_delivary.entity.Product;
import com.clothing_brand_delivary.repository.ProductRepository;
import com.clothing_brand_delivary.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void CreateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product FetchProducts(UUID id) {
		Product product = null;
		Optional<Product> optionalProducts = productRepository.findById(id);
		if (optionalProducts.isPresent()) {
			product = optionalProducts.get();
		}
		return product;
	}

}
