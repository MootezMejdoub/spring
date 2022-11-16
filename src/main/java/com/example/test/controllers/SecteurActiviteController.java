package com.example.test.controllers;

import com.example.test.services.SecteurActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secteurAc")
public class SecteurActiviteController {
    @Autowired
    SecteurActiviteService secteurActiviteService;

    @PutMapping("/asign/{idProduit}/{idStock}")
    public void assignSecteurActiviteToFournisseur(@PathVariable("idProduit") long fournisseurId,@PathVariable("idStock") long secteurActiviteId) {
        secteurActiviteService.assignSecteurActiviteToFournisseur(fournisseurId,secteurActiviteId);
    }

}
