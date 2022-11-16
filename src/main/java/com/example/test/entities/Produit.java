package com.example.test.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter

@EqualsAndHashCode
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;

    private String  codeProduit;
    private String libelleProduit;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;

    @ManyToOne
    private Stock stock;

    @ManyToOne
    private CategorieProduit categorieProduit;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture>detailFactureList;

}
