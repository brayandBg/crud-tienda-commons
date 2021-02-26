package com.dca.crud.tienda.commons.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "facturas")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Factura  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "id_provee")
    private long idProvee;
    @Column(name = "id_prod")
    private long idProd;
    @Column(name = "cant_prod")
    private long cantProd;

    private static final long serialVersionUID = 1l;
}

