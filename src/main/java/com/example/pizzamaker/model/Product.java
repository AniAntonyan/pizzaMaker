package com.example.pizzamaker.model;

import java.util.List;
import java.util.Objects;

public class Product {
   private int id;
   private int productTypeId;
   private String name;
   private float price;
   private String img;
   private int quantity;
   private List<Integer> ingredientsIdList;

    public Product() {
    }

    public Product(int id, int productTypeId, String name, float price, String img, int quantity, List<Integer> ingredientsIdList) {
        this.id = id;
        this.productTypeId = productTypeId;
        this.name = name;
        this.price = price;
        this.img = img;
        this.quantity = quantity;
        this.ingredientsIdList = ingredientsIdList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Integer> getIngredientsIdList() {
        return ingredientsIdList;
    }

    public void setIngredientsIdList(List<Integer> ingredientsIdList) {
        this.ingredientsIdList = ingredientsIdList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && productTypeId == product.productTypeId && Float.compare(product.price, price) == 0 && quantity == product.quantity && name.equals(product.name) && img.equals(product.img) && ingredientsIdList.equals(product.ingredientsIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productTypeId, name, price, img, quantity, ingredientsIdList);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productTypeId=" + productTypeId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                ", quantity=" + quantity +
                ", ingredientsIdList=" + ingredientsIdList +
                '}';
    }
}

