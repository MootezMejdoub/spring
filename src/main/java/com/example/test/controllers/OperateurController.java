package com.example.test.controllers;

import com.example.test.services.OperateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operateur")
public class OperateurController {

    @Autowired
    OperateurService operateurService;

    @PutMapping("/asign/{idProduit}/{idStock}")
    public void assignOperateurToFacture(@PathVariable("idProduit") long idOperateur, @PathVariable("idStock") long idFacture){
        operateurService.assignOperateurToFacture(idOperateur,idFacture);

    }
}
