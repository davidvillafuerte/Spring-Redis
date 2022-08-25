package com.example.demoredis.service.impl;

import com.example.demoredis.dao.IRepository;
import com.example.demoredis.model.Customer;
import com.example.demoredis.service.IServices;
import io.reactivex.rxjava3.core.Flowable;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements IServices {

    private final IRepository repository;


    @Override
    @Cacheable(value = "customer")
    public List<Customer>  getAllCustomers() {
        return repository.findAll();
    }
}
