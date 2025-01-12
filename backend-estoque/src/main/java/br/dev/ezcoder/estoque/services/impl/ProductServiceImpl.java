package br.dev.ezcoder.estoque.services.impl;

import br.dev.ezcoder.estoque.domain.entities.products.Product;
import br.dev.ezcoder.estoque.domain.entities.products.ProductDTO;
import br.dev.ezcoder.estoque.repository.ProductRepository;
import br.dev.ezcoder.estoque.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }
}
