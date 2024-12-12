package br.com.fantonio.mongo_ex1.adapter.outbound.mongo;

import br.com.fantonio.mongo_ex1.core.domain.entity.User;
import br.com.fantonio.mongo_ex1.core.port.out.UserRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MongoUserRepository implements UserRepositoryPort {

    @Autowired
    private SpringDataMongoUserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}

interface SpringDataMongoUserRepository extends org.springframework.data.mongodb.repository.
        MongoRepository<User, String> {
}
