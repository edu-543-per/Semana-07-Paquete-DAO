
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "descuentoproducto")
public class DescuentoProducto {
    @Id
    private int id;

    // Otros atributos
}
