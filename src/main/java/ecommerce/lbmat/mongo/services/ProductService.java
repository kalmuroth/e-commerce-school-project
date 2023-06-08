package ecommerce.lbmat.mongo.services;

import ecommerce.lbmat.mongo.entities.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    Product read(String id);
    List<Product> readAll();
}
