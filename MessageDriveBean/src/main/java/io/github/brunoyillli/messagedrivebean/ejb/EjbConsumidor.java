/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.messagedrivebean.ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author wolft
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(
            propertyName = "destinationLookup",
            propertyValue = "java/Fila"
    ),
    @ActivationConfigProperty(
            propertyName = "destinationType",
            propertyValue = "javax.jms.Queue"
    )
})
public class EjbConsumidor implements MessageListener{

    @Override
    public void onMessage(Message message) {
        System.out.println("mensagem recebida");
        try {
            TextMessage tm = (TextMessage) message;
            System.out.println(tm.getText());
        } catch (Exception e) {
        }
    }
    
}
