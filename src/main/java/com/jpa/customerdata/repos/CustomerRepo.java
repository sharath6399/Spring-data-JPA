package com.jpa.customerdata.repos;

import org.springframework.data.repository.CrudRepository;

import com.jpa.customerdata.entities.Customer;

public interface CustomerRepo extends CrudRepository<Customer,Integer>{
    
}
