
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "descuento")
public class Descuento {
    @Id
    private int id;

    // Otros atributos
}
