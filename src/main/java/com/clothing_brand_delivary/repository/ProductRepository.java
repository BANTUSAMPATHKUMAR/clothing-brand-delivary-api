package com.clothing_brand_delivary.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clothing_brand_delivary.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

}
