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
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSecteurActivite;

    private String codeSecteur;
    private String libelleSecteur;

    @ManyToMany(mappedBy = "secteurActiviteList")
    private  List<Fournisseur>fournisseurList;
}
