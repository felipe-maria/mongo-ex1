package br.com.fantonio.mongo_ex1.adapter.inbound.api;

import br.com.fantonio.mongo_ex1.core.port.in.UserService;
import br.com.fantonio.mongo_ex1.adapter.inbound.api.dto.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void add(@RequestBody UserDTO userDTO){
        userService.add(userDTO);
    }

    @GetMapping("/{id}")
    public UserDTO find(@PathVariable String id){
        return userService.find(id);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable String id) {
        userService.remove(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id, @RequestBody UserDTO userDTO){
        userService.update(id, userDTO);
    }

}
