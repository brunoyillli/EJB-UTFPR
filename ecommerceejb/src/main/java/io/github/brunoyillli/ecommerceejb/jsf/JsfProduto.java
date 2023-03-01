/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.ecommerceejb.jsf;

import io.github.brunoyillli.ecommerceejb.data.model.Produto;
import io.github.brunoyillli.ecommerceejb.ejb.EjbProduto;
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
public class JsfProduto {

    @EJB
    private EjbProduto ejbProduto;

    public JsfProduto() {
    }
    
    public ArrayList<Produto> getAll(){
        return ejbProduto.getAll();
    }
    
}
