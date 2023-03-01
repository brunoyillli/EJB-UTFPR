/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.ecommerceejb.data.model;

import lombok.Data;

@Data
public class Produto {
    private int codigo;
    private String descricao;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto() {
    }
    
    
    
}
