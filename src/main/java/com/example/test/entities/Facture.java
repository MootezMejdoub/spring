package com.example.test.entities;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture;

    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    private boolean archive;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactureList;

    @OneToMany(mappedBy ="facture" )
    private List<Reglement> reglementList;

    @ManyToOne
    private Fournisseur fournisseur;
}
