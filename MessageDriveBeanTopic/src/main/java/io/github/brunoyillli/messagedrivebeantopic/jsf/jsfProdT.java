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
import javax.jms.Topic;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author wolft
 */
@Named(value = "jsfProdT")
@RequestScoped
public class jsfProdT {

    /**
     * Creates a new instance of jsfProdT
     */
    public jsfProdT() {
    }
    
    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "java/Topico")
    private Topic topico;
    
    @Getter
    @Setter
    private String mensagem;
    
    @Getter
    @Setter
    private int quantidade = 1;
    
    
    public void send(){
        try {
            JMSContext context = connectionFactory.createContext();
            for(int i=0;i<quantidade;i++){
                context.createProducer().send(topico, mensagem + "["+i+"]");
            }
        } catch (Exception e) {
            System.out.println("ERRO" + e.getMessage());
        }
    }
    
}
