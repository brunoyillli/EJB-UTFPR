/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.messagedrivebeantopic.jsf;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author wolft
 */
@Named(value = "jsfProdQ")
@RequestScoped
public class jsfProdQ {

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "java/Fila")
    private Queue fila;
    
    @Getter
    @Setter
    private String mensagem;
    
    @Getter
    @Setter
    private int quantidade = 1;
    
    public jsfProdQ() {
    }
    
    public void send(){
        try {
            JMSContext context = connectionFactory.createContext();
            for(int i=0;i<quantidade;i++){
                context.createProducer().send(fila, mensagem + "["+i+"]");
            }
        } catch (Exception e) {
            System.out.println("ERRO" + e.getMessage());
        }
    }
    
}
