/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.tarefaejb.jsf;

import io.github.brunoyillli.tarefaejb.data.model.Usuario;
import io.github.brunoyillli.tarefaejb.data.model.UsuariosWrapper;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.TextMessage;

/**
 *
 * @author wolft
 */
@Named(value = "jsfProdQ")
@RequestScoped
public class jsfProdQ {

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "java/Soma")
    private Queue soma;

    public jsfProdQ() {
    }

    public void send(List<Usuario> usuarios, String nomeUsuario) {

        Optional<Usuario> usuarioMaior = usuarios.stream()
                .max(Comparator.comparing(Usuario::getPontos));
        if (usuarioMaior.isPresent()) {
            if (usuarioMaior.get().getNome().equals(nomeUsuario)) {
                try {
                    JMSContext context = connectionFactory.createContext();
                    UsuariosWrapper usuariosWrapper = new UsuariosWrapper(usuarios);
                    ObjectMessage message = context.createObjectMessage();
                    message.setStringProperty("tipo", "usuariosWrapper");
                    message.setObject(usuariosWrapper);

                    TextMessage textMessage = context.createTextMessage();
                    textMessage.setStringProperty("tipo", "nomeUsuario");
                    textMessage.setText(nomeUsuario);

                    context.createProducer().send(soma, textMessage);
                    context.createProducer().send(soma, message);
                } catch (JMSException e) {
                    System.out.println("ERRO" + e.getMessage());
                }
            }
        }
    }

}
