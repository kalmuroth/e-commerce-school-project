package ecommerce.lbmat.mongo.services;

import ecommerce.lbmat.mongo.entities.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User read(String id);
    List<User> readAll();
    List<User> findByLoginPassword(String email, String password);
}
