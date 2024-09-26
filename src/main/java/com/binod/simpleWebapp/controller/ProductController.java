package com.binod.simpleWebapp.controller;

import com.binod.simpleWebapp.model.Product;
import com.binod.simpleWebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/product")
    public List<Product> product(){
        return service.getProduct();
    }
    @RequestMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }
    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    @DeleteMapping("product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
