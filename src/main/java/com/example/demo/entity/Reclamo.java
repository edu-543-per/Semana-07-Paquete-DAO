
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reclamo")
public class Reclamo {
    @Id
    private int id;

    // Otros atributos
}
