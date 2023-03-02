/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.tarefaejb.jsf;

import io.github.brunoyillli.tarefaejb.data.model.Operacao;
import io.github.brunoyillli.tarefaejb.ejb.EjbOperacao;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import lombok.Getter;
import lombok.Setter;


@Named(value = "jsfOperacao")
@SessionScoped
public class jsfOperacao implements Serializable{
    
    @EJB
    private EjbOperacao ejbOperacao;

    @Getter
    @Setter
    private Operacao soma;
    
    
    public String validar(Operacao soma){
       boolean resultado = ejbOperacao.validar(soma);
       return resultado ? "Você acertou !" : "Resposta incorreta";
    }
    
    public jsfOperacao() {
        soma = new Operacao();
    }
    
    public void init() {
        soma = new Operacao();
    }
}
