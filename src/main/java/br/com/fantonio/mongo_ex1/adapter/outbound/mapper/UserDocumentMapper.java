package br.com.fantonio.mongo_ex1.adapter.outbound.mapper;

import br.com.fantonio.mongo_ex1.adapter.outbound.mongo.document.UserDocument;
import br.com.fantonio.mongo_ex1.core.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDocumentMapper {

    public UserDocument convert2Document(User user) {
        UserDocument userDocument = new UserDocument();
        userDocument.setId(user.id());
        userDocument.setName(user.name());
        userDocument.setAge(user.age());

        return userDocument;
    }

    public User convert2Entity(UserDocument userDocument) {
        return new User(
                userDocument.getId(),
                userDocument.getName(),
                userDocument.getAge()
        );
    }
}
