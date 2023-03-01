/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.ecommerceejb.jsf;

import io.github.brunoyillli.ecommerceejb.data.crud.EjbCompra;
import io.github.brunoyillli.ecommerceejb.data.model.ItemCompra;
import io.github.brunoyillli.ecommerceejb.data.model.Produto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;

/**
 *
 * @author wolft
 */
@Named(value = "jsfCompra")
@SessionScoped
public class jsfCompra implements Serializable {

    @EJB
    private EjbCompra ejbCompra;

    public void add(Produto produto){
        ejbCompra.add(produto);
    }
    
    public ArrayList<ItemCompra> getAll(){
        return ejbCompra.getAll();
    }
    
    public void limparLista(){
        ejbCompra.limparLista();
    }
    
    public jsfCompra() {
    }
    
}
