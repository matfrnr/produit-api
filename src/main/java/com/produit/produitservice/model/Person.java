package com.produit.produitservice.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue
    private long person_id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "person")
    private Set<Address> addressList;
}
