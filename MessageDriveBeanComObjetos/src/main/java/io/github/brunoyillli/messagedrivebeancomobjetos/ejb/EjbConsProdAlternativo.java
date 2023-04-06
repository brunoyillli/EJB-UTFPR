/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.messagedrivebeancomobjetos.ejb;

import io.github.brunoyillli.messagedrivebeancomobjetos.model.Produto;
import java.util.ArrayList;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(
            propertyName = "destinationLookup",
            propertyValue = "java/Topico"
    ),
    @ActivationConfigProperty(
            propertyName = "destinationType",
            propertyValue = "javax.jms.Topic"
    )
})
public class EjbConsProdAlternativo implements MessageListener{

    @Override
    public void onMessage(Message message) {
        System.out.println("(Topico) Mensage recebida pelo " + this.getClass().getSimpleName());
        try {
            ObjectMessage tm = (ObjectMessage)message;
            ArrayList<Produto> lprod = new ArrayList<>();
            lprod = (ArrayList<Produto>) tm.getObject();
            for(Produto produto: lprod){
                System.out.println("Produto: " + produto.getCodigo() + " : " +produto.getDescricao());
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
        

    }
    
}
