package br.com.fantonio.mongo_ex1.core.port.in;

import br.com.fantonio.mongo_ex1.core.domain.entity.User;

public interface UserService {

    void add(User user);

    User find(String id);

    void remove(String id);

    void update(String id, User user);
}
