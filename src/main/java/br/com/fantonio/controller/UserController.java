package br.com.fantonio.controller;

import br.com.fantonio.dto.UserDTO;
import br.com.fantonio.service.UserService;
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
        userService.find(id);

        return new UserDTO();
    }

    @DeleteMapping("/{id}")
    public void remove() {
        System.out.println("Not implemented yet");
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id, @RequestBody UserDTO userDTO){
        System.out.println("Not implemented yet");
    }

}
