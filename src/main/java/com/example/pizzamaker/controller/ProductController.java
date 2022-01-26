package com.example.pizzamaker.controller;

import com.example.pizzamaker.model.Product;
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

//   private int id;
//   private int productTypeId;
//   private String name;
//   private float price;
//   private String img;
//   private int quantity;
//   private List<Integer> ingredientsIdList;

public class ProductController extends HttpServlet {

    private List<Product> list = new LinkedList<>();
    private static Random random = new Random();
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("this is GET method");

        if(list.size() == 0) {
            for (int i = 0; i < 10; i++) {
                list.add(new Product(i, i+1, "product"+i,
                        random.nextFloat(), "src/123", 6));
            }
            System.out.println(list);
        }

        resp.getWriter().println(gson.toJson(list));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("this is POST method");

        int id = list.get(list.size() - 1).getId() + 1;

        int productTypeId = Integer.parseInt(req.getParameter("productTypeId"));
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        String img = req.getParameter("img");
        int quantity = Integer.parseInt(req.getParameter("quantity"));


        Product data = new Product(id,productTypeId,name,price,img,quantity);

        list.add(data);

        resp.getWriter().println(gson.toJson(list));
    }


    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("desk");
        resp.getWriter().println("this is PUT method");

        Product pdt = null;

        int id = Integer.parseInt(req.getParameter("id"));

        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                pdt = list.get(i);
                break;
            }
        }

        if(pdt == null){
            resp.sendError(400, "there is no table with mentioned id");
            return;
        }
        int productTypeId = Integer.parseInt(req.getParameter("productTypeId"));
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        String img = req.getParameter("img");
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        pdt.setProductTypeId(productTypeId);
        pdt.setName(name);
        pdt.setPrice(price);
        pdt.setImg(img);
        pdt.setQuantity(quantity);


        resp.getWriter().println(gson.toJson(list));
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

