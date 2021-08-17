/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ministerioDeCultura.Controller;

import co.com.ministerioDeCultura.Entity.Museo;
import co.com.ministerioDeCultura.Facade.MuseoFacadeLocal;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;

/**
 *
 * @author oscar
 */
@Named(value = "museoSession")
@ViewScoped
public class MuseoView implements Serializable {

    /**
     * Creates a new instance of MuseoSession
     */
      @EJB
    MuseoFacadeLocal museoFacadeLocal;
    
    public MuseoView() {
    }
    
    
        public List<Museo>ListaMuseos(){
         try {
             return museoFacadeLocal.findAll();
         } catch (Exception e) {
         }
      return null;
     }
     
}
