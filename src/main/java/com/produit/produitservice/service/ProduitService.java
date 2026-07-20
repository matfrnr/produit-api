package com.produit.produitservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.produit.produitservice.exceptions.ProduitNotFoundException;
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

    public Produit getProduitById(long id) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);

        if (optionalProduit.isEmpty()) {
            throw new ProduitNotFoundException("Le produit n'existe pas");
        }
        return optionalProduit.get();
    }

    public String deleteProduitById(long id) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);

        if (optionalProduit.isEmpty()) {
            throw new RuntimeException("Le produit n'existe pas");
        }
        produitRepository.delete(optionalProduit.get());
        return "Produit supprimé";
    }

    public Produit editProduit(long id, Produit produit) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);

        if (optionalProduit.isEmpty()) {
            throw new RuntimeException("Le produit n'existe pas");
        }

        Produit produitEdit = optionalProduit.get();
        produitEdit.setName(produit.getName());
        produitEdit.setPrix(produit.getPrix());

        return produitRepository.save(produitEdit);
    }
}
