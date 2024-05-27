package com.javachallengers.solid.srp.spring.withsrp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}