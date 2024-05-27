package com.javachallengers.solid.srp.spring.withsrp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private OrderRepository orderRepository;

    public String placeOrder(OrderRequest orderRequest) {
        // Validate user
        User user = userRepository.findById(orderRequest.getUserId()).orElseThrow(() -> new RuntimeException("Invalid User"));

        // Check inventory
        Book book = bookRepository.findById(orderRequest.getBookId()).orElseThrow(() -> new RuntimeException("Book not available"));
        if (book.getStock() < orderRequest.getQuantity()) {
            throw new RuntimeException("Insufficient book stock");
        }

        // Update book stock
        book.setStock(book.getStock() - orderRequest.getQuantity());
        bookRepository.save(book);

        // Create and save the order
        Order order = new Order();
        order.setUserId(orderRequest.getUserId());
        order.setBookId(orderRequest.getBookId());
        order.setQuantity(orderRequest.getQuantity());
        orderRepository.save(order);

        return "Order placed successfully";
    }
}