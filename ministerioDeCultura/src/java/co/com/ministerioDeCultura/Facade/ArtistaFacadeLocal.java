/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ministerioDeCultura.Facade;

import co.com.ministerioDeCultura.Entity.Artista;
import java.util.List;

/**
 *
 * @author oscar
 */
public interface ArtistaFacadeLocal {
    
    void create(Artista museo);

    void edit(Artista artista);

    void remove(Artista artista);

    Artista find(Object id);

    List<Artista> findAll();

    List<Artista> findRange(int[] range);

    int count();
}
