package com.produit.produitservice.service;

import org.springframework.stereotype.Service;

import com.produit.produitservice.repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
}
