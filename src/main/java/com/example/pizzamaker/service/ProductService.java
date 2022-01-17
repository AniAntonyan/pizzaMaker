package com.example.pizzamaker.service;

import com.example.pizzamaker.model.Product;

import java.util.List;

public interface ProductService {

    Product read(int id);

    Product readByProductType(int productTypeId);

    List<Product> readAll();

    void create();

    Product update(int id, Product product);

    void delete(int id);
}
