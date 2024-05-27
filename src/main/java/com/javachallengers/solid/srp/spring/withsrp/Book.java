package com.javachallengers.solid.srp.spring.withsrp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
  @Id
  private Long id;
  private int stock;

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
}