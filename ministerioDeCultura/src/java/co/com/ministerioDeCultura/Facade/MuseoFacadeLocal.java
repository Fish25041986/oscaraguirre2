/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ministerioDeCultura.Facade;

import co.com.ministerioDeCultura.Entity.Museo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author oscar
 */
@Local
public interface MuseoFacadeLocal {
    
    void create(Museo museo);

    void edit(Museo museo);

    void remove(Museo museo);

    Museo find(Object id);

    List<Museo> findAll();

    List<Museo> findRange(int[] range);

    int count();
}
