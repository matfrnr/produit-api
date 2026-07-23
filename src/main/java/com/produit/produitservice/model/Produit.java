package com.produit.produitservice.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Cette classe correspond à une table dans la base de données.
@AllArgsConstructor // Crée un constructeur avec tous les attributs.
@NoArgsConstructor // Crée un constructeur vide (sans paramètres).
@Getter // Génère automatiquement les getters de tous les attributs.
@Setter // Génère automatiquement les setters de tous les attributs.
@Builder // Permet de créer un objet plus facilement et de manière plus lisible.
@Table(name = "produit") // Donne un nom précis à la table dans la base de données.
public class Produit {

    @Id // Indique que cet attribut est la clé primaire.
    @GeneratedValue // générée automatiquement
    private long produit_id;

    private String name;
    private double prix;

    @ManyToMany
    @JoinTable(
        // Nom qu'on veut donner dans la bdd (ce qu'on veut)
        name = "product_category",
        joinColumns = @JoinColumn(name = "produit_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categoryList;

}