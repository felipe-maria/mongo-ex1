package br.com.fantonio.mongo_ex1.core.domain.services;

import br.com.fantonio.mongo_ex1.adapter.outbound.mongo.MongoUserRepository;
import br.com.fantonio.mongo_ex1.core.domain.entity.User;
import br.com.fantonio.mongo_ex1.core.port.in.UserService;
import br.com.fantonio.mongo_ex1.adapter.inbound.api.dto.UserDTO;
import br.com.fantonio.mongo_ex1.adapter.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoUserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(UserDTO userDTO) {
        User user = userMapper.convert2Entity(userDTO);

        userRepository.save(user);
    }


    @Override
    public UserDTO find(String id) {
        User user = userRepository.findById(id).get();

        return userMapper.convert2Dto(user);
    }


    @Override
    public void remove(String id) {
        userRepository.deleteById(id);
    }


    @Override
    public void update(String id, UserDTO userDTO) {
        User user = userMapper.convert2Entity(userDTO);

        userRepository.save(user);
    }

}
