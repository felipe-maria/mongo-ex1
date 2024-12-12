package br.com.fantonio.mongo_ex1.adapter.inbound.api.dto;

public record UserDTO(
        String id,
        String name,
        Long age
) {
}
