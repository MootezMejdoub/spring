package com.example.test.controllers;

import com.example.test.entities.Facture;
import com.example.test.entities.Produit;
import com.example.test.services.FactureService;
import com.example.test.services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired
    FactureService factureService;

    //localhost:9090/add
    @PostMapping("/add")
    public Facture addContrat(@RequestBody Facture contrat){
        return  factureService.addProduit(contrat);
    }
    @GetMapping("/getFacture/{id}")
    public Facture getById(@PathVariable("id") long id ){
        return factureService.getById(id);
    }

    @PutMapping ("/updateFacture/{id}")
    public Facture updateContrat(@PathVariable ("id")long id,@RequestBody Facture contrat) {

        return factureService.updateProduit(id,contrat);
    }

    @DeleteMapping("/deleteFacture/{id}")
    public void deleteContrat(@PathVariable("id") long id) {
        factureService.deleteProduit(id);
    }

    @GetMapping("/getAll")
    public List<Facture> findAll() {
        return factureService.findAll();

    }
}


