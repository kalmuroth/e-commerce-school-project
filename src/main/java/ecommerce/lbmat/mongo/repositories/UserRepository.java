package ecommerce.lbmat.mongo.repositories;

import ecommerce.lbmat.mongo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
