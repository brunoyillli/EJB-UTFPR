/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.ecommerceejb.data.model;

import lombok.Data;

@Data
public class ItemCompra {

    private Produto produto;
    private int quantidade;

    public ItemCompra() {
    }

    public ItemCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

}
