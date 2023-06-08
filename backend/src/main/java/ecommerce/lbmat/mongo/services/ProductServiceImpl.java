package ecommerce.lbmat.mongo.services;

import ecommerce.lbmat.mongo.entities.Product;
import ecommerce.lbmat.mongo.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private ProductRepository repository;

    @Override
    public Product create(Product entity) {
        return repository.save(entity);
    }

    @Override
    public Product read(String id) {
        return repository.findById(id).orElse(null);
    }
    @Override
    public List<Product> readAll() {
        return repository.findAll();
    }
}
