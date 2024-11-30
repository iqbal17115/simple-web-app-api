package com.iqbal.simpleWebApp.service;

import com.iqbal.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Laptop", 50000), new Product(102, "Mobile", 15000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int productId) {
        return products.stream().filter(p->p.getProductId() == productId).findFirst().orElse(new Product(0, "No Item Found!", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int i=0; i<products.size();i++) {
           if(products.get(i).getProductId() == product.getProductId()) {
              index = 1;
           }
        }

        products.set(index, product);
    }

    public void deleteProduct(Product product) {
        int index = 0;
        for(int i=0; i<products.size();i++) {
            if(products.get(i).getProductId() == product.getProductId()) {
                index = 1;
            }
        }

        products.remove(index);
    }
}
