package br.com.fantonio.mongo_ex1.core.port.out;

import br.com.fantonio.mongo_ex1.core.domain.entity.User;

public interface UserRepository {

    User insert(User user);

    User findById(String id);

    void deleteById(String id);

    User update(String id, User user);
}
