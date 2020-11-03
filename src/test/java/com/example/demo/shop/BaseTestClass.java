package com.example.demo.shop;

import org.junit.jupiter.api.BeforeEach;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import com.example.demo.shop.catalog.CatalogController;
import com.example.demo.shop.orders.OrdersController;

public class BaseTestClass {

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new CatalogController(), new OrdersController());
    }
}