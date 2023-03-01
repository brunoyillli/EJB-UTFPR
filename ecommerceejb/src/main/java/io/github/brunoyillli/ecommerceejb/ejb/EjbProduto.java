/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.brunoyillli.ecommerceejb.ejb;

import io.github.brunoyillli.ecommerceejb.data.crud.CrudProduto;
import io.github.brunoyillli.ecommerceejb.data.model.Produto;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author wolft
 */
@Stateless
public class EjbProduto {

    
    public ArrayList<Produto> getAll(){
        return new CrudProduto().getAll();
    }
}
