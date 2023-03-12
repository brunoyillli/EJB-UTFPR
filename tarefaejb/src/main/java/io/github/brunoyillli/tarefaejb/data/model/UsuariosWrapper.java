/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.tarefaejb.data.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wolft
 */
@XmlRootElement
public class UsuariosWrapper implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Usuario> usuarios;

    public UsuariosWrapper(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public UsuariosWrapper() {
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
