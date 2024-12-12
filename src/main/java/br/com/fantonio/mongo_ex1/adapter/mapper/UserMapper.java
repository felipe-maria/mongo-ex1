package br.com.fantonio.mongo_ex1.adapter.mapper;

import br.com.fantonio.mongo_ex1.adapter.inbound.api.dto.UserDTO;
import br.com.fantonio.mongo_ex1.core.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO convert2Dto(User entity) {

        return new UserDTO(
                entity.getId(),
                entity.getName(),
                entity.getIdade()
        );
    }


    public User convert2Entity(UserDTO dto) {
        var entity = new User();

        entity.setId(dto.id());
        entity.setIdade(dto.age());
        entity.setName(dto.name());

        return entity;
    }

}
