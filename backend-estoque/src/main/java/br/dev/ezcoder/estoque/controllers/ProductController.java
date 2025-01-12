package br.dev.ezcoder.estoque.controllers;

import br.dev.ezcoder.estoque.domain.entities.products.Product;
import br.dev.ezcoder.estoque.domain.entities.products.ProductDTO;
import br.dev.ezcoder.estoque.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createNewProduct (@RequestBody ProductDTO productDto) {
        var product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return productService.save(product);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts () {
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProductById (@PathVariable Long id) {
        Optional<Product> productOptional = productService.findProductById(id);

        if (productOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product Not found.");
        }

        return ResponseEntity.status(HttpStatus.OK).body(productOptional.get());
    }
}
