package com.javachallengers.solid.srp.spring.withoutsrp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}