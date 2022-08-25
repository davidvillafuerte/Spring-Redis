package com.example.demoredis.service;

import com.example.demoredis.model.Customer;
import io.reactivex.rxjava3.core.Flowable;

import java.util.List;

public interface IServices {

    List<Customer> getAllCustomers();
}
