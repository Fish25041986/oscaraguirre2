/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ministerioDeCultura.Controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author oscar
 */
@Named(value = "artistaSession")
@SessionScoped
public class ArtistaSession implements Serializable {

    /**
     * Creates a new instance of ArtistaSession
     */
    public ArtistaSession() {
    }
    
}
