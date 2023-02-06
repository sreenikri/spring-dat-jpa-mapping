package com.edu.jpa.controller;

import com.edu.jpa.dto.OrderRequest;
import com.edu.jpa.dto.OrderResponse;
import com.edu.jpa.entity.Customer;
import com.edu.jpa.repository.CustomerRepository;
import com.edu.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;


@PostMapping("/placeorder")
public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());


    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAll(){
    return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInfo(){
        return customerRepository.getJoinInformation();

        //return null;
    }
}
