package com.example.test.entities;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFacture;

    private int qteCommandee;
    private float prixTotalDetail;
    private int pourcentageRemis;
    private float montantRemise;

    @ManyToOne
    private Produit produit;

    @ManyToOne
    private  Facture facture;


}
