package com.example.demoredis.dao;

import com.example.demoredis.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository<Customer,String> {
}
