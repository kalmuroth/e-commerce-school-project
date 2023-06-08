package ecommerce.lbmat.mongo.repositories;

import ecommerce.lbmat.mongo.entities.Caddie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaddieRepository extends MongoRepository<Caddie,String> {}
