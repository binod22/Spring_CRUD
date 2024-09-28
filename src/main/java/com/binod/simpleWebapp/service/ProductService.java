package com.binod.simpleWebapp.service;

import com.binod.simpleWebapp.model.Product;
import com.binod.simpleWebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
    /*List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(1,"Iphone",50000),
            new Product(2,"Samsung",40000),
            new Product(3,"Canon",30000)));*/

    public List<Product> getProduct(){
    return repo.findAll();
    }

    public Product getProductById( int ProdId) {
        return repo.findById(ProdId).orElse(new Product());
    }

    public void addProduct(Product prod){
            repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
       repo.deleteById(prodId);
    }
}
