package com.ead.springbootbackend.repository;

import com.ead.springbootbackend.model.Customer;
import com.ead.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
