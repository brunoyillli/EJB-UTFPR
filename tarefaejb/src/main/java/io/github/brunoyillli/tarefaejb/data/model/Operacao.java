/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.tarefaejb.data.model;

import java.io.Serializable;
import java.util.Random;
import lombok.Data;

@Data
public class Operacao implements Serializable{
    private int number1;
    private int number2;
    private int resultado;

    public Operacao(int number1, int number2, int resultado) {
        this.number1 = number1;
        this.number2 = number2;
        this.resultado = resultado;
    }
    
     public Operacao() {    
        Random random = new Random();
        this.number1 = random.nextInt(100);
        this.number2 = random.nextInt(100);
    }
}
