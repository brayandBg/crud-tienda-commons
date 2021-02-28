package com.dca.crud.tienda.commons.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tiendas")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    private static final long serialVersionUID = 1l;
}
