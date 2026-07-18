package com.produit.produitservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.produit.produitservice.model.Produit;
import com.produit.produitservice.repository.ProduitRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProduitService {
    private final ProduitRepository produitRepository;

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }
}
