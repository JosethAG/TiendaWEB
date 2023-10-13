package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired //Crea un unico objeto mientras se ejecute la app
    private CategoriaDao categoriaDao;
    public List<Categoria> getCategorias(boolean activos){
        var lista = categoriaDao.findAll(); //Busca todos los datos de la lista
        
        if(activos){
            lista.removeIf(e->!e.isActivo()); //Esta expresion nos permite saber si el objeto esta activo on no
        }
        
        return lista;
    }
}
