package br.dev.ezcoder.estoque.services;

import br.dev.ezcoder.estoque.domain.entities.products.Product;
import br.dev.ezcoder.estoque.domain.entities.products.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Optional<Product> findProductById(Long id);
}
