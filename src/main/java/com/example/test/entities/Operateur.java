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
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idOperateur;
    private String nom;
    private String prenom;
    private String password;

    @OneToMany
    private List<Facture>factureList;


}
