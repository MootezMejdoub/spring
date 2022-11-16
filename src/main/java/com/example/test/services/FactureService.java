package com.example.test.services;

import com.example.test.entities.Facture;
import com.example.test.entities.Produit;

import java.util.List;

public interface FactureService {
    public Facture addProduit(Facture produit);
    public Facture getById(long id );
    public Facture updateProduit(long id, Facture produit);
    public void deleteProduit(long id );

    public List<Facture> findAll();

}
