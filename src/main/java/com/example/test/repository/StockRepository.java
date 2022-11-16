package com.example.test.repository;

import com.example.test.entities.SecteurActivite;
import com.example.test.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
