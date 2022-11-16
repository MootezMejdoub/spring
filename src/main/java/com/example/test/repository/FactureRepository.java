package com.example.test.repository;

import com.example.test.entities.Facture;
import com.example.test.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture
        ,Long> {
}
