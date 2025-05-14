
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalleventa")
public class DetalleVenta {
    @Id
    private int id;

    // Otros atributos
}
