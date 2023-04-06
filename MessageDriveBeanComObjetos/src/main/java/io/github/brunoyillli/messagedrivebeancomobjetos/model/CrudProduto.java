/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.messagedrivebeancomobjetos.model;

import java.util.ArrayList;

/**
 *
 * @author wolft
 */
public class CrudProduto {

    public ArrayList<Produto> getAll() {
        ArrayList<Produto> lprod = new ArrayList<>();
        lprod.add(new Produto(1, "Computador"));
        lprod.add(new Produto(2, "Mause"));
        lprod.add(new Produto(3, "Teclado"));
        lprod.add(new Produto(4, "Monitor"));

        return lprod;
    }
}
