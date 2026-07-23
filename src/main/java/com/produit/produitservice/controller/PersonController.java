package com.produit.produitservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.produit.produitservice.service.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;
}
