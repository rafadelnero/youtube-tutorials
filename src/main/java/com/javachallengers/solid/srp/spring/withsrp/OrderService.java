package com.javachallengers.solid.srp.spring.withsrp;

import org.aspectj.weaver.ast.Or;
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
        User user = userRepository.findById(orderRequest.getUserId()).orElseThrow(() -> new RuntimeException("Invalid User"));
        Book book = bookRepository.findById(orderRequest.getBookId()).orElseThrow(() -> new RuntimeException("Book not available"));

        if (book.getStock() < orderRequest.getQuantity()) {
            throw new RuntimeException("Insufficient book stock");
        }

        book.setStock(book.getStock() - orderRequest.getQuantity());
        bookRepository.save(book);

        var order = new Order(orderRequest.getUserId(), orderRequest.getBookId(), orderRequest.getQuantity());
        orderRepository.save(order);

        return "Order placed successfully";
    }

}