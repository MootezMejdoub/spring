package com.example.test.services;

import com.example.test.entities.Produit;

import java.util.List;

public interface IProduitService {

    public Produit addProduit(Produit produit);
    public Produit getById(long id );
    public Produit updateProduit(long id,Produit produit);
    public void deleteProduit(long id );

    public List<Produit> findAll();

    void assignProduitToStock(long idProduit, long idStock);


}
