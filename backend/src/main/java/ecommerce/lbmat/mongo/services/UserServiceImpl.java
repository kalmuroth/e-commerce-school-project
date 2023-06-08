package ecommerce.lbmat.mongo.services;

import ecommerce.lbmat.mongo.entities.User;
import ecommerce.lbmat.mongo.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
    @Slf4j
        @AllArgsConstructor
public class UserServiceImpl implements UserService{
    private UserRepository repository;

    @Override
    public User create(User entity) {
        return repository.save(entity);
    }
    @Override
    public User read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<User> readAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findByLoginPassword(String email, String password) {
        return repository.findActorByEmailOrPassword(email,password);
    }
}
