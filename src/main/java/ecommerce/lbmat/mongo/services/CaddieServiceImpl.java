package ecommerce.lbmat.mongo.services;

import ecommerce.lbmat.mongo.entities.Caddie;
import ecommerce.lbmat.mongo.repositories.CaddieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class CaddieServiceImpl implements CaddieService{
    private CaddieRepository repository;

    @Override
    public Caddie create(Caddie entity) {
        return repository.save(entity);
    }
    @Override
    public Caddie read(String id) {
        return repository.findById(id).orElse(null);
    }
    @Override
    public List<Caddie> readAll() {
        return repository.findAll();
    }
    @Override
    public Caddie update(Caddie entity) {
        return repository.save(entity);
    }
}
