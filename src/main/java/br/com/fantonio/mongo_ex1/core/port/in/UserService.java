package br.com.fantonio.mongo_ex1.core.port.in;

import br.com.fantonio.mongo_ex1.core.domain.entity.User;

public interface UserService {

    User add(User user);

    User find(String id);

    void remove(String id);

    User update(String id, User user);
}
