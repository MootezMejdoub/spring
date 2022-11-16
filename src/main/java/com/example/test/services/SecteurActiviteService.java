package com.example.test.services;

import com.example.test.entities.Facture;
import com.example.test.entities.SecteurActivite;

import java.util.List;

public interface SecteurActiviteService {

    public SecteurActivite addProduit(SecteurActivite produit);
    public SecteurActivite getById(long id );
    public SecteurActivite updateProduit(long id, SecteurActivite produit);
    public void deleteProduit(long id );

    public List<SecteurActivite> findAll();
    public void assignSecteurActiviteToFournisseur(long fournisseurId, long
            secteurActiviteId) ;

}
