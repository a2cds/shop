package com.example.demo.shop.orders;

import java.net.URI;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    
    public static final Logger logger = LoggerFactory.getLogger(OrdersController.class);

    @PostMapping(consumes = { "application/json" })
    public ResponseEntity<Void> placeOrder() {
        UUID orderId = UUID.randomUUID();
        logger.info("Created order with id {}", orderId);
        return ResponseEntity.created(URI.create("/orders/" + orderId)).build();
    }

}