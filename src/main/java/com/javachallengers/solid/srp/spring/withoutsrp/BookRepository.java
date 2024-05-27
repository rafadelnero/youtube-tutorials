package com.javachallengers.solid.srp.spring.withoutsrp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}