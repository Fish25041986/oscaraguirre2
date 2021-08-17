/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ministerioDeCultura.Facade;

import co.com.ministerioDeCultura.Entity.Pintura;
import java.util.List;

/**
 *
 * @author oscar
 */
public interface PinturaFacadeLocal {
    
        void create(Pintura pintura);

    void edit(Pintura pintura);

    void remove(Pintura pintura);

    Pintura find(Object id);

    List<Pintura> findAll();

    List<Pintura> findRange(int[] range);

    int count();
}
