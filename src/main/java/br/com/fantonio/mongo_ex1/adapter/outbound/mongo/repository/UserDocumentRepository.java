package br.com.fantonio.mongo_ex1.adapter.outbound.mongo.repository;

import br.com.fantonio.mongo_ex1.adapter.outbound.mapper.UserDocumentMapper;
import br.com.fantonio.mongo_ex1.adapter.outbound.mongo.document.UserDocument;
import br.com.fantonio.mongo_ex1.core.domain.entity.User;
import br.com.fantonio.mongo_ex1.core.port.out.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDocumentRepository implements UserRepository {

    @Autowired
    private SpringDataMongoUserRepository repository;

    @Autowired
    private UserDocumentMapper userDocumentMapper;

    @Override
    public User save(User user) {
        UserDocument userDocument = userDocumentMapper.convert2Document(user);

        return userDocumentMapper.convert2Entity(repository.save(userDocument));
    }

    @Override
    public User findById(String id) {
        UserDocument userDocument = repository.findById(id).get();

        return userDocumentMapper.convert2Entity(userDocument);
    }

    @Override
    public void deleteById(String id) {

        repository.deleteById(id);
    }

    @Override
    public User updateUser(String id, User user) {
        UserDocument userDocument = userDocumentMapper.convert2Document(user);
        userDocument.setId(id);

        return userDocumentMapper.convert2Entity(repository.save(userDocument));
    }
}

interface SpringDataMongoUserRepository extends org.springframework.data.mongodb.repository.MongoRepository<UserDocument, String> {
}
