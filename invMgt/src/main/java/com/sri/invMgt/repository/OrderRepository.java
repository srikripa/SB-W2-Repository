package com.sri.invMgt.repository;

import org.springframework.data.repository.CrudRepository;

import com.sri.invMgt.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>	{

}
