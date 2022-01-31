package com.example.pizzamaker.service;

import com.example.pizzamaker.model.Product;
import com.example.pizzamaker.model.dto.ProductDto;

import java.util.List;

public interface ProductService {

    ProductDto read(int id);

    List<ProductDto> readAll();

    List<ProductDto> readAllByProductType(int productTypeId);

    void create();

    Product update(int id, Product product);

    void delete(int id);
}
