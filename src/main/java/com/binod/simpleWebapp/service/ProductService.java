package com.binod.simpleWebapp.service;

import com.binod.simpleWebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(1,"Iphone",50000),
            new Product(2,"Samsung",40000),
            new Product(3,"Canon",30000)));

    public List<Product> getProduct(){
    return products;
    }

    public Product getProductById( int ProdId) {
        return products.stream()
                .filter(p -> p.getId() == ProdId)
                .findFirst().get();
    }

    public void addProduct(Product prod){
            products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i=0; i<products.size();i++){
            if (products.get(i).getId() == prod.getId()){
                index = i;
            }
        }
        products.set(index, prod);
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i=0; i<products.size();i++){
            if (products.get(i).getId() == prodId){
                index = i;
            }
        }
        products.remove(index);
    }
}
