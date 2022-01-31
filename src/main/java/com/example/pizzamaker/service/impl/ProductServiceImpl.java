package com.example.pizzamaker.service.impl;

import com.example.pizzamaker.model.Ingredient;
import com.example.pizzamaker.model.Product;
import com.example.pizzamaker.model.dto.ProductDto;
import com.example.pizzamaker.repository.ProductRepository;
import com.example.pizzamaker.service.ProductService;

import java.util.LinkedList;
import java.util.List;


public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository = new ProductRepository();

    @Override
    public ProductDto read(int id) {
        ProductDto productDto = new ProductDto();
        List<ProductDto> fromDb = productRepository.read(id);

        productDto.setId(fromDb.get(0).getId());
        productDto.setProductTypeId(fromDb.get(0).getProductTypeId());
        productDto.setPrice(fromDb.get(0).getPrice());
        productDto.setName(fromDb.get(0).getName());
        productDto.setImagePath(fromDb.get(0).getImagePath());
        productDto.setCurrency(fromDb.get(0).getCurrency());
        productDto.setIngredients(new LinkedList<>());

        fromDb.forEach(item -> {
            Ingredient ingredient = new Ingredient(item.getIngredientId(), item.getIngredientName());
            productDto.getIngredients().add(ingredient);
        });

        return productDto;
    }


    @Override
    public List<ProductDto> readAll() {
        ProductDto productDto=new ProductDto();
        List<ProductDto> fromData=productRepository.readAll();


    }

    @Override
    public List<ProductDto> readAllByProductType(int productTypeId) {
        return null;
    }

    @Override
    public void create() {
    }

    @Override
    public Product update(int id, Product product) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
