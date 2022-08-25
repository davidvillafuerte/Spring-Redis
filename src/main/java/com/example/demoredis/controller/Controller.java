package com.example.demoredis.controller;

import com.example.demoredis.model.Customer;
import com.example.demoredis.service.impl.ServiceImpl;
import io.reactivex.rxjava3.core.Flowable;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final ServiceImpl service;

    @GetMapping("/getAllCustomers")
    public ResponseEntity<Flowable<Customer>> getAll(){
        Flowable<Customer> customerFlowable = Flowable.fromIterable(service.getAllCustomers());
        return ResponseEntity.ok(customerFlowable);
    }
}
