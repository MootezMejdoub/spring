package com.example.test.services;

import com.example.test.entities.Facture;
import com.example.test.entities.Produit;
import com.example.test.repository.FactureRepository;
import com.example.test.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceImp implements FactureService {
    @Autowired
    FactureRepository factureRepository;


    @Override
    public Facture addProduit(Facture produit) {
        return factureRepository.save(produit);
    }

    @Override
    public Facture getById(long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public Facture updateProduit(long id, Facture produit) {
        Facture prod=factureRepository.findById(id).orElse(null);
        prod.setMontantFacture(produit.getMontantFacture());

        return factureRepository.save(prod);
    }



    @Override
    public void deleteProduit(long id) {
        factureRepository.deleteById(id);


    }

    @Override
    public List<Facture> findAll() {
        return factureRepository.findAll();
    }

}
