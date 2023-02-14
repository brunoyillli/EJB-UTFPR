/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.aula4pratica3web.jsf;

import io.github.brunoyillli.aula4pratica3lib.ICalculadora;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author wolft
 */
@Named(value = "jsfCalculadora")
@RequestScoped
@Getter
@Setter
public class JsfCalculadora {

    @EJB
    private ICalculadora ejbCalculadora;

    public JsfCalculadora() {
    }
    
    public void somar(){
        resultado = ejbCalculadora.somar(valorA, valorB);
    }
    
    private int valorA;
    private int valorB;
    private int resultado;
}
