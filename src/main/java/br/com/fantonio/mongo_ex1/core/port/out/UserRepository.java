package br.com.fantonio.mongo_ex1.core.port.out;

import br.com.fantonio.mongo_ex1.core.domain.entity.User;

public interface UserRepository {

    User save(User user);

    User findById(String id);

    void deleteById(String id);

    User updateUser(String id, User user);
}
