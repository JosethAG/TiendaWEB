package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Se declara un metodo para obtener un ArrayList de objetos Categoria
    //Los objetos vienen de la base de datos, todos los registros
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocaran los metodos para hacer el CRUD de categorias, sem 6
    
}
