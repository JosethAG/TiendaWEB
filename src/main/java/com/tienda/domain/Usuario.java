package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{//Serealizacion funciona para almacenar ciertos datos en la maquina
    
    private static final long serialVersionUID = 1L;//para poder hacer el ciclo de la sumatoria del idUsuario
    @Id //tabla usuario tiene una llave o identificador que va a ser el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Los valores generados que tipo de estrategia utilizan, identico = sea igual en la BD y en la clase
    @Column(name="id_usuario")//decir cual es el nombre de la columna de la base de datos  
    private long idUsuario;
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany //usuario que puede tener muchos roles
    @JoinColumn(name = "id_usuario")
    List<Rol> roles;    
   
}
