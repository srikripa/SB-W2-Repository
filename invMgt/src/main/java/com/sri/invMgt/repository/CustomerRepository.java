package com.sri.invMgt.repository;

import org.springframework.data.repository.CrudRepository;

import com.sri.invMgt.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
