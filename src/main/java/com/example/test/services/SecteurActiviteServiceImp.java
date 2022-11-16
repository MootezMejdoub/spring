package com.example.test.services;

import com.example.test.entities.Fournisseur;
import com.example.test.entities.SecteurActivite;
import com.example.test.repository.FournisseurRepository;
import com.example.test.repository.SecteurActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SecteurActiviteServiceImp implements SecteurActiviteService {
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Autowired
    SecteurActiviteRepository secteurActiviteRepository;
    @Override
    public SecteurActivite addProduit(SecteurActivite produit) {
        return null;
    }

    @Override
    public SecteurActivite getById(long id) {
        return null;
    }

    @Override
    public SecteurActivite updateProduit(long id, SecteurActivite produit) {
        return null;
    }

    @Override
    public void deleteProduit(long id) {

    }

    @Override
    public List<SecteurActivite> findAll() {
        return null;
    }

    @Override
    public void assignSecteurActiviteToFournisseur(long fournisseurId, long secteurActiviteId) {
        Fournisseur fournisseur=fournisseurRepository.findById(fournisseurId).orElse(null);
        SecteurActivite secteurActivite=secteurActiviteRepository.findById(fournisseurId).orElse(null);


        List <SecteurActivite> secteurActiviteList=new ArrayList<>();
        List <Fournisseur> fournisseurList=new ArrayList<>();

        secteurActiviteList.add(secteurActivite);
        fournisseurList.add(fournisseur);
        fournisseur.setSecteurActiviteList(secteurActiviteList);
        secteurActivite.setFournisseurList(fournisseurList);

        fournisseurRepository.save(fournisseur);
        secteurActiviteRepository.save(secteurActivite);

    }
}
