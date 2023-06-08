package ecommerce.lbmat.mongo.controllers;

import ecommerce.lbmat.mongo.entities.Product;
import ecommerce.lbmat.mongo.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/products")
@Slf4j
@AllArgsConstructor
public class ProductController {
    private ProductService service;

    @GetMapping({"/","/all"})
    public List<Product> getAllProduct(){
        return service.readAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id){
        return service.read(id);
    }

    @RequestMapping(value = "/add", method=POST)
    public Product postProduct(Product product){
        return service.create(product);
    }
}