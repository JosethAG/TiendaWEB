package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{ //Serializacion funciona para almacenar datos en el disco
    private static final long serialVersionUID = 1L; //para poder hacer el ciclo del incremental del ID
    
    @Id //Tabla categor[ia tiene un identificador ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //los valores generados que utilicen el tipo de estrategia identico a la DB
    @Column(name="id_categoria")//
    private long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
    
    
}
