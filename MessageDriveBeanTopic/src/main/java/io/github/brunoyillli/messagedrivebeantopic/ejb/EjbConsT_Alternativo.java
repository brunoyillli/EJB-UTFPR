/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.messagedrivebeantopic.ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

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
public class EjbConsT_Alternativo implements MessageListener{

    @Override
    public void onMessage(Message message) {
        System.out.println("(Topico) mensagem recebida pelo" + this.getClass().getSimpleName());
        try {
            TextMessage tm = (TextMessage) message;
            System.out.println(tm.getText());
        } catch (JMSException e) {
            System.out.println("ERRO" + e.getMessage());

        }
    }
    
}
