package br.com.fantonio.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExemploController {
    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo!";
    }

    @PostMapping("/greet")
    public String greet(@RequestBody Usuario usuario) {
        return "Olá, " + usuario.getNome() + "!";
    }

    public static class Usuario {
        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

    }

}