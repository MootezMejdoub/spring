package com.example.test.controllers;

import com.example.test.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.test.services.IProduitService;


import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {
    @Autowired
    IProduitService iProduitService;

    //localhost:9090/add
    @PostMapping("/add")
    public Produit addContrat(@RequestBody Produit contrat){
        return  iProduitService.addProduit(contrat);
    }
    @GetMapping("/getContrat/{id}")
    public Produit getById(@PathVariable("id") long id ){
        return iProduitService.getById(id);
    }

    @PutMapping ("/updateContrat/{id}")
    public Produit updateContrat(@PathVariable ("id")long id,@RequestBody Produit contrat) {

        return iProduitService.updateProduit(id,contrat);
    }

    @DeleteMapping("/deleteContrat/{id}")
    public void deleteContrat(@PathVariable("id") long id) {
        iProduitService.deleteProduit(id);
    }

    @GetMapping("/getAll")
    public List<Produit> findAll() {
        return iProduitService.findAll();

    }
    @PutMapping("/asign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable("idProduit") long idProduit,@PathVariable("idStock") long idStock){
        iProduitService.assignProduitToStock(idProduit,idStock);

    }


}
