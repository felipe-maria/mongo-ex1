package br.com.fantonio.mongo_ex1.core.port.in;

import br.com.fantonio.mongo_ex1.adapter.inbound.api.dto.UserDTO;

public interface UserService {

    void add(UserDTO userDTO);

    UserDTO find(String id);

    void remove(String id);

    void update(String id, UserDTO userDTO);
}
