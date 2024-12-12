package br.com.fantonio.mongo_ex1.controller.dto;

public record UserDTO(
        String id,
        String name,
        Long age
) {
}
