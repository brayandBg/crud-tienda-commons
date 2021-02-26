package com.dca.crud.tienda.commons.models.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "proveedores")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private static final long serialVersionUID = 1l;
}
