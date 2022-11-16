package com.example.test.entities;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCategorieProduit;
    private String codeProduit;
    private String libelleCategorieProduit;

    @OneToMany(mappedBy = "categorieProduit")
    private List<Produit> produitList;
}
