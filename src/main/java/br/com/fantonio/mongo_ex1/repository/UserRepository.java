package br.com.fantonio.mongo_ex1.repository;

import br.com.fantonio.mongo_ex1.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
