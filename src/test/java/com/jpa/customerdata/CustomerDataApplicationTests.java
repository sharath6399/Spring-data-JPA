package com.jpa.customerdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.customerdata.entities.Customer;
import com.jpa.customerdata.repos.CustomerRepo;

@SpringBootTest
class CustomerDataApplicationTests {

	@Autowired
	CustomerRepo customerRepo;
	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("chimtu");
		customer.setEmail("chimtu@gmail.com");

		customerRepo.save(customer);
		
	}

	@Test
	public void testRead(){
		Customer customer = customerRepo.findById(1).get();
		System.out.println("Customer name is ----------->>>>"+customer.getEmail());

	}

	@Test
	public void testUpdate(){
		Customer customer = customerRepo.findById(1).get();
		customer.setEmail("chimtu99@gmail.com");
		customerRepo.save(customer);
	}

	@Test
	public void testDelete(){
		if(customerRepo.existsById(1)){
		customerRepo.deleteById(1);
		}
	}

}
