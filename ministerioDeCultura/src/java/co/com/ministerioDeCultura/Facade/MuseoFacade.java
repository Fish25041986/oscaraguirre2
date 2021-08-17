/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ministerioDeCultura.Facade;

import co.com.ministerioDeCultura.Entity.Museo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oscar
 */
@Stateless
public class MuseoFacade extends AbstractFacade<Museo> implements MuseoFacadeLocal{

    @PersistenceContext(unitName = "ministerioDeCulturaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MuseoFacade() {
        super(Museo.class);
    }
    
}
