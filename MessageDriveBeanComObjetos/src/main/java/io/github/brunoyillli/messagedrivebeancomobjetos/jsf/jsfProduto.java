/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.messagedrivebeancomobjetos.jsf;

import io.github.brunoyillli.messagedrivebeancomobjetos.ejb.EjbProduto;
import io.github.brunoyillli.messagedrivebeancomobjetos.model.Produto;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author wolft
 */
@Named(value = "jsfProduto")
@RequestScoped
public class jsfProduto {

    @EJB
    private EjbProduto ejbProduto;
    
    
    public jsfProduto() {
    }
    
    public ArrayList<Produto> getAll(){
       return ejbProduto.getAll();
    }
    
}
