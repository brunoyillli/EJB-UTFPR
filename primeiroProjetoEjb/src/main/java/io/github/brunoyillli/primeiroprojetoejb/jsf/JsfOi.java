/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.primeiroprojetoejb.jsf;

import io.github.brunoyillli.primeiroprojetoejb.ejb.EjbOlaMundo;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author wolft
 */
@Named(value = "jsfOi")
@RequestScoped
public class JsfOi {

    @EJB
    private EjbOlaMundo ejbOlaMundo;

    public JsfOi() {
    }
    
    public String getOi(){
        return ejbOlaMundo.getOi();
    }
    
}
