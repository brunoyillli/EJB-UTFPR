/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package io.github.brunoyillli.ecommerceejb.data.crud;

import io.github.brunoyillli.ecommerceejb.data.model.ItemCompra;
import io.github.brunoyillli.ecommerceejb.data.model.Produto;
import java.util.ArrayList;
import javax.ejb.Stateful;

/**
 *
 * @author wolft
 */
@Stateful
public class EjbCompra {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private ArrayList<ItemCompra> listItemCompra;
    
    public EjbCompra(){
        listItemCompra = new ArrayList<>();
    }
    
    public void add(Produto produto){
        boolean achou = false;
        for (ItemCompra itemCompra : listItemCompra) {
            if(itemCompra.getProduto().getCodigo() == produto.getCodigo()){
                itemCompra.setQuantidade(itemCompra.getQuantidade()+1);
                achou = true;
                break;
            }
        }
        if(!achou){
            listItemCompra.add(new ItemCompra(produto, 1));
        }
    }
    
    public ArrayList<ItemCompra> getAll(){
        return listItemCompra;
    }
    
    public void limparLista(){
        listItemCompra = new ArrayList<>();
    }
}
