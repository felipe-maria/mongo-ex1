package br.com.fantonio.mongo_ex1.adapter.inbound.api;

import br.com.fantonio.mongo_ex1.adapter.inbound.mapper.UserDtoMapper;
import br.com.fantonio.mongo_ex1.core.domain.entity.User;
import br.com.fantonio.mongo_ex1.core.port.in.UserService;
import br.com.fantonio.mongo_ex1.adapter.inbound.api.dto.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDtoMapper userDtoMapper;

    @PostMapping
    public UserDTO add(@RequestBody UserDTO userDTO){

        User inputUser = userDtoMapper.convert2Entity(userDTO);
        User outputUser = userService.add(inputUser);

        return userDtoMapper.convert2Dto(outputUser);
    }

    @GetMapping("/{id}")
    public UserDTO find(@PathVariable String id){
        User user = userService.find(id);

        UserDTO userDTO = userDtoMapper.convert2Dto(user);
        return userDTO;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable String id) {
        userService.remove(id);
    }

    @PutMapping("/{id}")
    public UserDTO update(@PathVariable String id, @RequestBody UserDTO userDTO){
        User inputUser = userDtoMapper.convert2Entity(userDTO);
        User outputUser = userService.update(id, inputUser);

        return userDtoMapper.convert2Dto(outputUser);
    }

}
