package br.com.fantonio.service;

import br.com.fantonio.dto.UserDTO;
import br.com.fantonio.entity.User;
import br.com.fantonio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void add(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());

        userRepository.insert(user);
    }

    public UserDTO find(String id) {

        User user = userRepository.findById(id).get();
        UserDTO dto = new UserDTO();
        dto.setName(user.getName());
        dto.setId(user.getId());

        return dto;
    }
}
