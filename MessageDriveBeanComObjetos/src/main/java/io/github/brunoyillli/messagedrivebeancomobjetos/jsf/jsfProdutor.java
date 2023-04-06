/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.messagedrivebeancomobjetos.jsf;

import io.github.brunoyillli.messagedrivebeancomobjetos.ejb.EjbProduto;
import io.github.brunoyillli.messagedrivebeancomobjetos.model.Produto;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Topic;

/**
 *
 * @author wolft
 */
@Named(value = "jsfProdutor")
@RequestScoped
public class jsfProdutor {

    @EJB
    private EjbProduto ejbProduto;
    
    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;
    
    @Resource(lookup = "java/Topico")
    private Topic topico;
    
    public jsfProdutor() {
    }
    
    public void send(){
        try {
            ArrayList<Produto> lprod;
            lprod = ejbProduto.getAll();
            Connection conn = connectionFactory.createConnection();
            Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
            ObjectMessage om = session.createObjectMessage();
            
            om.setObject(lprod);
            
            JMSContext context = connectionFactory.createContext();
            
            context.createProducer().send(topico, om);
        }catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
