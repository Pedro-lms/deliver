package com.deliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliver.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
