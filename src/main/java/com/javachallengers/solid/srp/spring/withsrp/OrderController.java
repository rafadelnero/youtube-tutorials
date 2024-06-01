package com.javachallengers.solid.srp.spring.withsrp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/placeOrder")
    public ResponseEntity<Object> placeOrder(@RequestBody OrderRequest orderRequest) {
        try {
            String response = orderService.placeOrder(orderRequest);
            return ResponseEntity.ok(response);
        } catch (RuntimeException ex) {
            if (ex.getMessage().equals("Invalid User") || ex.getMessage().equals("Book not available")) {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
            }
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}