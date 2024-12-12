package br.com.fantonio.mongo_ex1.adapter.inbound.mapper;

import br.com.fantonio.mongo_ex1.adapter.inbound.api.dto.UserDTO;
import br.com.fantonio.mongo_ex1.core.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {

    public UserDTO convert2Dto(User entity) {

        return new UserDTO(
                entity.id(),
                entity.name(),
                entity.age()
        );
    }

    public User convert2Entity(UserDTO dto) {
        return new User(
                dto.id(),
                dto.name(),
                dto.age()
        );
    }

}
