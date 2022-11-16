package com.example.test.services;

import com.example.test.entities.Facture;
import com.example.test.entities.Operateur;
import com.example.test.repository.FactureRepository;
import com.example.test.repository.OperateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperateurServiceImp implements OperateurService{
    @Autowired
    OperateurRepository operateurRepository;
    @Autowired
    FactureRepository factureRepository;

    @Override
    public void assignOperateurToFacture(long idOperateur, long idFacture) {
        Operateur operateur=operateurRepository.findById(idOperateur).orElse(null);
        Facture facture=factureRepository.findById(idFacture).orElse(null);
            List<Facture>factureList=new ArrayList<>();
        if(operateur!=null&&facture!=null){
            factureList.add(facture);
            operateur.setFactureList(factureList);
            facture.setIdFacture(idFacture);
            factureRepository.save(facture);
            operateurRepository.save(operateur);
        }


    }
}
