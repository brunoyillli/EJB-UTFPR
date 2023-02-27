/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.atividadewebconf;

import io.github.brunoyillli.atividadewebconf.ejb.EjbPrimosLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author wolft
 */
@Named(value = "jsfPrimos")
@RequestScoped
public class JsfPrimos {

    @EJB
    private EjbPrimosLocal ejbPrimosLocal;

    private Integer numero;
    private Integer resultado;

    public JsfPrimos() {
    }

    public void findPrimo() {
        resultado = ejbPrimosLocal.nextPrimo(numero);
    }

    public EjbPrimosLocal getEjbPrimosLocal() {
        return ejbPrimosLocal;
    }

    public void setEjbPrimosLocal(EjbPrimosLocal ejbPrimosLocal) {
        this.ejbPrimosLocal = ejbPrimosLocal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    

}
