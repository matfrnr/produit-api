package com.produit.produitservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produit.produitservice.model.Produit;

// Permet de communiquer avec la table Produit de la base de données.
// Produit => la classe à manipuler - Long => type de la clé primaire
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    // Permet d'effectuer les opérations CRUD sur la table Produit
}
