package br.dev.ezcoder.estoque.domain.entities.products;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;

public record ProductDTO(String nome, String codigo, Integer quantidadeEstoque, BigDecimal precoUnitario) {
}
