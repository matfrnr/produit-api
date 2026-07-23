package com.produit.produitservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Address {

    @Id
    @GeneratedValue
    private long address_id;
    private String street;
    private String city;
    private String state;

    // Lié la table adresse à utilisateur
    @ManyToOne
    @JoinColumn(name = "id")
    private Person person;
}
