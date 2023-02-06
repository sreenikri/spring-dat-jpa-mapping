package com.edu.jpa.repository;

import com.edu.jpa.dto.OrderResponse;
import com.edu.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.edu.jpa.dto.OrderResponse(c.name,p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
