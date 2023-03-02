/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package io.github.brunoyillli.tarefaejb.jsf;

import io.github.brunoyillli.tarefaejb.data.model.Operacao;
import io.github.brunoyillli.tarefaejb.data.model.Usuario;
import io.github.brunoyillli.tarefaejb.ejb.EjbUsuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;
import lombok.Getter;
import lombok.Setter;

@Named(value = "jsfUsuario")
@SessionScoped
public class jsfUsuario implements Serializable {

    @Getter
    @Setter
    private String usuario;

    @EJB
    private EjbUsuario ejbUsuario;

    public void pontuar(String usuario, Operacao soma) {
        ejbUsuario.pontuar(usuario,soma);
    }

    public void add(String usuario){
        ejbUsuario.add(usuario);
    }
    
    public ArrayList<Usuario> getAll() {
        return ejbUsuario.getAll();
    }

    public jsfUsuario() {
    }

}
