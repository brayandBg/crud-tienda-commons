package com.dca.crud.tienda.commons.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Table(name = "productos")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String descpri;
    private double precio;
    private String unidad;

    private static final long serialVersionUID = 1l;
}
