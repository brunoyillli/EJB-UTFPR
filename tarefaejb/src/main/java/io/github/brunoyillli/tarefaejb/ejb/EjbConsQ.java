/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.tarefaejb.ejb;

import io.github.brunoyillli.tarefaejb.data.model.UsuariosWrapper;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(
            propertyName = "destinationLookup",
            propertyValue = "java/Soma"
    ),
    @ActivationConfigProperty(
            propertyName = "destinationType",
            propertyValue = "javax.jms.Queue"
    )
})
public class EjbConsQ implements MessageListener{

    @Override
    public void onMessage(Message message) {
        try {
            if (message instanceof TextMessage){
                TextMessage textMessage = (TextMessage) message;
                System.out.println("O vencedor atual eh: " + textMessage.getText());
            }
            if (message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                String tipo = objectMessage.getStringProperty("tipo");
                if ("usuariosWrapper".equals(tipo)) {
                    UsuariosWrapper usuariosWrapper = (UsuariosWrapper) objectMessage.getObject();
                    usuariosWrapper.getUsuarios().forEach(System.out::println);
                }
            }
        } catch (JMSException e) {
            System.out.println("ERRO" + e.getMessage());
        }
    }

}
