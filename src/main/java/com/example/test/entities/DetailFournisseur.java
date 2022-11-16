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
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule;

    @OneToOne (mappedBy = "fournisseur")
    private Fournisseur fournisseur;

}
