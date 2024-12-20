package br.com.fantonio.mongo_ex1.core.domain.service;

import br.com.fantonio.mongo_ex1.core.domain.entity.User;
import br.com.fantonio.mongo_ex1.core.port.in.UserService;
import br.com.fantonio.mongo_ex1.core.port.out.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(User user) {
        return userRepository.insert(user);
    }

    @Override
    public User find(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void remove(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(String id, User user) {
        return userRepository.update(id, user);
    }

}
