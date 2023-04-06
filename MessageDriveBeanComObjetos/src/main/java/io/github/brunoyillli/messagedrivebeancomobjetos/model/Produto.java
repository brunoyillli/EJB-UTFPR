/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.messagedrivebeancomobjetos.model;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author wolft
 */
@Data
public class Produto implements Serializable{
    private int codigo;
    private String descricao;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto() {
    }
    
    
}
