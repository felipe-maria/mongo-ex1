package br.com.fantonio.mongo_ex1.service;

import br.com.fantonio.mongo_ex1.controller.dto.UserDTO;
import br.com.fantonio.mongo_ex1.entity.User;
import br.com.fantonio.mongo_ex1.mapper.UserMapper;
import br.com.fantonio.mongo_ex1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public void add(UserDTO userDTO) {
        User user = userMapper.convert2Entity(userDTO);

        userRepository.insert(user);
    }


    public UserDTO find(String id) {
        User user = userRepository.findById(id).get();

        return userMapper.convert2Dto(user);
    }


    public void remove(String id) {
        userRepository.deleteById(id);
    }


    public void update(String id, UserDTO userDTO) {
        User user = userMapper.convert2Entity(userDTO);

        userRepository.save(user);
    }

}
