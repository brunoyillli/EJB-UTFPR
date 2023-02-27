/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.ejbsomardoisnumeros.jsf;

import io.github.brunoyillli.ejbsomardoisnumeros.ejb.EjbSomarLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Bruno Mendes Carvalho
 */
@Named(value = "jsfSomar")
@RequestScoped
public class JsfSomar {

    @EJB
    private EjbSomarLocal ejbSomar;

    private Double valorA;
    private Double valorB;
    private Double resultado;

    public JsfSomar() {

    }

    public void somar() {
        resultado = ejbSomar.somar(valorA, valorB);
    }

    public Double getValorA() {
        return valorA;
    }

    public void setValorA(Double valorA) {
        this.valorA = valorA;
    }

    public Double getValorB() {
        return valorB;
    }

    public void setValorB(Double valorB) {
        this.valorB = valorB;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

}
