package com.example.demo.shop.catalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/catalog")
public class CatalogController {
    
    public static final Logger logger = LoggerFactory.getLogger(CatalogController.class);

    @GetMapping(value = "/items", produces = { "application/json" })
    public ResponseEntity<String> retrieveAllItems() {
        logger.info("Received request for shop items");
        return ResponseEntity.ok().body("[{ \"id\": \"6b76148d-0fda-4ebf-8966-d91bfaeb0236\", \"img\": \"https://images.unsplash.com/photo-1590688178590-bb8370b70528\", \"name\": \"Breakfast with homemade bread\", \"price\": 16 }, { \"id\": \"52d59380-79da-49d5-9d09-9716e20ccbc4\", \"img\": \"https://images.unsplash.com/photo-1592894869086-f828b161e90a\", \"name\": \"Brisket\", \"price\": 24 }, { \"id\": \"a7be01f8-b76e-4384-bf1d-e69d7bdbe4b4\", \"img\": \"https://images.unsplash.com/photo-1544025162-d76694265947\", \"name\": \"Pork Ribs\", \"price\": 20 }]");
    }

}