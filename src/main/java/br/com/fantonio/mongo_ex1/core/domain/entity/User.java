package br.com.fantonio.mongo_ex1.core.domain.entity;

public record User(
        String id,
        String name,
        Long age
) {
}
