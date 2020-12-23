package com.sri.invMgt.repository;

import org.springframework.data.repository.CrudRepository;

import com.sri.invMgt.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>	 {

}
