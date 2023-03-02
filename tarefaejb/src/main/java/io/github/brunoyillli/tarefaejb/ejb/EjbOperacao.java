/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.brunoyillli.tarefaejb.ejb;

import io.github.brunoyillli.tarefaejb.data.model.Operacao;
import javax.ejb.Stateless;

@Stateless
public class EjbOperacao {
    
    public Boolean validar(Operacao soma){
        return soma.getNumber1() + soma.getNumber2() == soma.getResultado();
    }
    
}
