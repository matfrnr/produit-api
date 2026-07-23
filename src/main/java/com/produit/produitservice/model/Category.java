package com.produit.produitservice.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Category {

    @Id
    @GeneratedValue
    private long category_id;
    private String name;

    @ManyToMany(mappedBy = "categoryList")
    private List<Produit> produitList;
}
