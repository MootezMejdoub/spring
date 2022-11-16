package com.example.test.entities;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Entity

public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;

    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;

    @OneToMany(mappedBy = "fournisseur")
    private List<Facture>factureList;

    @ManyToMany
    private List<SecteurActivite> secteurActiviteList;

    @OneToOne
    private DetailFournisseur fournisseur;
}
