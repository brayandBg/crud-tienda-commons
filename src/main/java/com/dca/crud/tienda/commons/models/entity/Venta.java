package com.dca.crud.tienda.commons.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "ventas")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "id_prod")
    private Long idProduct;
    @Column(name = "cant_prod")
    private Long cantProd;
    private Double precio;

    private static final long serialVersionUID = 1l;
}
