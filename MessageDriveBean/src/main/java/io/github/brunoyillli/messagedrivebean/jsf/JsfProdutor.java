/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.messagedrivebean.jsf;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.jms.ConnectionFactory;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import lombok.Getter;
import lombok.Setter;

@Named(value = "jsfProdutor")
@RequestScoped
public class JsfProdutor {

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "java/Fila")
    private Queue fila;
    
    public JsfProdutor() {   
    }
    
    @Getter
    @Setter
    private String mensagem;
    
    public void send(){
        try {
            JMSContext context = connectionFactory.createContext();
            context.createProducer().send(fila, mensagem);
        } catch (Exception e) {
            System.out.println("ERRO" + e.getMessage());
        }
    }
}
