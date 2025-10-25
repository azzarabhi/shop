package com.shop4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shop4.entities.Product;
import com.shop4.repository.ProductRepository;

@CrossOrigin(origins = "*") // permet d'appeler depuis Angular
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // 🔹 GET - Tous les produits
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 🔹 GET - Produit par ID
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productRepository.findById(id);
    }

    // 🔹 POST - Ajouter un produit
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // 🔹 PUT - Modifier un produit
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Produit non trouvé");
        }
        updatedProduct.setId(id);
        return productRepository.save(updatedProduct);
    }



    // 🔹 DELETE - Supprimer un produit
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}
