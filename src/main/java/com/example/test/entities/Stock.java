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
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStock;
    private int qte;
    private int qteMin;
    private String libelleStock;

    @OneToMany(mappedBy = "stock")
    private List<Produit> listProduit;

}
