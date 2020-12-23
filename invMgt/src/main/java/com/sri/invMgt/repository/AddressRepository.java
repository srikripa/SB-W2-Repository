package com.sri.invMgt.repository;

import org.springframework.data.repository.CrudRepository;

import com.sri.invMgt.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long>	{

}
