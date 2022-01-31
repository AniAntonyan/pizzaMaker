package com.example.pizzamaker.controller;

import com.example.pizzamaker.model.Ingredient;
import com.example.pizzamaker.model.Product;
import com.example.pizzamaker.model.dto.ProductDto;
import com.example.pizzamaker.service.ProductService;
import com.example.pizzamaker.service.impl.ProductServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ProductController extends HttpServlet {

    private List<Product> list = new LinkedList<>();
    private static Random random = new Random();
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductService productService = new ProductServiceImpl();
        String url = req.getParameter("url");
        Gson gson = new Gson();
        List<ProductDto> data = new LinkedList<>();

        switch (url) {
            case "get-all-by-product-type":
                int productTypeId = Integer.parseInt(req.getParameter("product_type_id"));
                data.addAll(productService.readAllByProductType(productTypeId));
                break;
            case "get-by-id":

                int id = Integer.parseInt(req.getParameter("product_id"));
                ProductDto product = productService.read(id);
                data.add(product);
                break;

            case "get-all":
                data.addAll(productService.readAll());
                break;
        }

        resp.getWriter().println(gson.toJson(data));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        private int id;
//        private transient int ingredientId;
//        private int productTypeId;
//        private float price;
//        private String name;
//        private transient String ingredientName;
//        private String imagePath;
//        private String currency;
//        List<Ingredient> ingredients;

//        String name = req.getParameter("name");
//        Ingredient ingredient = new Ingredient(0, name);
//        ingredientService.create(ingredient);
    }


    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("desk");
//        resp.getWriter().println("this is PUT method");
//
//        Product pdt = null;
//
//        int id = Integer.parseInt(req.getParameter("id"));
//
//        for (int i = 0; i < list.size(); i++){
//            if(list.get(i).getId() == id){
//                pdt = list.get(i);
//                break;
//            }
//        }
//
//        if(pdt == null){
//            resp.sendError(400, "there is no table with mentioned id");
//            return;
//        }
//        int productTypeId = Integer.parseInt(req.getParameter("productTypeId"));
//        String name = req.getParameter("name");
//        float price = Float.parseFloat(req.getParameter("price"));
//        String img = req.getParameter("img");
//        int quantity = Integer.parseInt(req.getParameter("quantity"));
//
//        pdt.setProductTypeId(productTypeId);
//        pdt.setName(name);
//        pdt.setPrice(price);
//        pdt.setImg(img);
//        pdt.setQuantity(quantity);
//
//
//        resp.getWriter().println(gson.toJson(list));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("this is a delete method");

        int delId = Integer.parseInt(req.getParameter("idToDelete"));

        List<Product> collect = list.stream().filter(item -> item.getId() == delId).collect(Collectors.toList());

        list.removeAll(collect);

        resp.getWriter().println(gson.toJson(list));
    }
}

