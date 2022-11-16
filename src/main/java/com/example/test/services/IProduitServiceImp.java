package com.example.test.services;

import com.example.test.entities.Produit;
import com.example.test.entities.Stock;
import com.example.test.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.test.repository.ProduitRepository;

import java.util.List;

@Service
public class IProduitServiceImp implements IProduitService {
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    StockRepository stockRepository;


    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit getById(long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public Produit updateProduit(long id, Produit produit) {
        Produit prod=produitRepository.findById(id).orElse(null);
        prod.setCodeProduit(produit.getCodeProduit());
        prod.setLibelleProduit(produit.getLibelleProduit());
        prod.setPrix(produit.getPrix());
        return produitRepository.save(prod);
    }

    @Override
    public void deleteProduit(long id) {
        produitRepository.deleteById(id);


    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public void assignProduitToStock(long idProduit, long idStock) {
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        Stock stock=stockRepository.findById(idStock).orElse(null);
        produit.setStock(stock);
        produitRepository.save(produit);
    }
}
