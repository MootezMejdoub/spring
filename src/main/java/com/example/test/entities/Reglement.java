package com.example.test.entities;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReglement;
    private float montantPaye;
    private float montantRestant;
    private  boolean payee;
    @Temporal(TemporalType.DATE)
    private Date dateReglement;

    @ManyToOne
    private Facture facture;

}
