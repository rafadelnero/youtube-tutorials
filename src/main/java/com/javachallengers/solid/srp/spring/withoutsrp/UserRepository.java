package com.javachallengers.solid.srp.spring.withoutsrp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}