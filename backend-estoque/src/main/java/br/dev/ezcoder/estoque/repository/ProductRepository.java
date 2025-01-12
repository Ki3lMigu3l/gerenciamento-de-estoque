package br.dev.ezcoder.estoque.repository;

import br.dev.ezcoder.estoque.domain.entities.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
