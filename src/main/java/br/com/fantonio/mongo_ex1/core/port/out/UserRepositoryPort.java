package br.com.fantonio.mongo_ex1.core.port.out;

import br.com.fantonio.mongo_ex1.core.domain.entity.User;

import java.util.Optional;

public interface UserRepositoryPort {

    User save(User user);

    Optional<User> findById(String id);

    void deleteById(String id);

}
