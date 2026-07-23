package com.produit.produitservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produit.produitservice.model.Person;
 
public interface PersonRepository extends JpaRepository<Person, Long> {

}
