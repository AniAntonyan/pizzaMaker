package com.example.pizzamaker.service.impl;

import com.example.pizzamaker.model.ProductType;
import com.example.pizzamaker.repository.ProductTypeRepository;
import com.example.pizzamaker.service.ProductTypeService;

import java.util.List;

public class ProductTypeServiceImpl implements ProductTypeService {
    private final ProductTypeRepository productTypeRepository =new ProductTypeRepository();

    @Override
    public ProductType read(int id) {
        return null;
    }

    @Override
    public List<ProductType> readAll() {
        return null;
    }

    @Override
    public ProductType read(String name) {
        return null;
    }
    @Override
    public void create() {

    }

    @Override
    public ProductType update(int id, ProductType productType) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
