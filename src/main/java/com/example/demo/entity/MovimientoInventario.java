
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimientoinventario")
public class MovimientoInventario {
    @Id
    private int id;

    // Otros atributos
}
