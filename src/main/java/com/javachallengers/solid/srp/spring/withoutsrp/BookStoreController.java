package com.javachallengers.solid.srp.spring.withoutsrp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookstore")
public class BookStoreController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/placeOrder")
    public ResponseEntity<Object> placeOrder(@RequestBody OrderRequest orderRequest) {
        User user = userRepository.findById(orderRequest.getUserId()).orElse(null);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Invalid User");
        }

        Book book = bookRepository.findById(orderRequest.getBookId()).orElse(null);
        if (book == null || book.getStock() <= 0) {
            return ResponseEntity.badRequest().body("Book not available");
        }

        if (book.getStock() < orderRequest.getQuantity()) {
            return ResponseEntity.badRequest().body("Insufficient book stock");
        }
        book.setStock(book.getStock() - orderRequest.getQuantity());
        bookRepository.save(book);

        Order order = new Order();
        order.setUserId(orderRequest.getUserId());
        order.setBookId(orderRequest.getBookId());
        order.setQuantity(orderRequest.getQuantity());
        orderRepository.save(order);

        return ResponseEntity.ok("Order placed successfully");
    }
}