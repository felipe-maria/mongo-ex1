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
    public void add(@RequestBody UserDTO userDTO){

        User user = userDtoMapper.convert2Entity(userDTO);
        userService.add(user);
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
    public void update(@PathVariable String id, @RequestBody UserDTO userDTO){
        User user = userDtoMapper.convert2Entity(userDTO);
        userService.update(id, user);
    }

}
