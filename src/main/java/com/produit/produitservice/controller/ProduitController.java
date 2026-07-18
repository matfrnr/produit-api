package com.produit.produitservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produit.produitservice.model.Produit;
import com.produit.produitservice.service.ProduitService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/produits")
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/all")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @PostMapping("path")
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.createProduit(produit);
    }

}
