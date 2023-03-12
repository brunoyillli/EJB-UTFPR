/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package io.github.brunoyillli.tarefaejb.ejb;

import io.github.brunoyillli.tarefaejb.data.model.Operacao;
import io.github.brunoyillli.tarefaejb.data.model.Usuario;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.ejb.Stateful;

@Stateful
public class EjbUsuario {

    private List<Usuario> listUsuarios;

    public EjbUsuario() {
        this.listUsuarios = new ArrayList<>();
    }

    public void pontuar(String usuario, Operacao soma) {
        if (validar(soma)) {
            Optional<Usuario> usuarioEncontrado = this.findUser(usuario);
            if (usuarioEncontrado.isPresent()) {
                usuarioEncontrado.get()
                        .setPontos(usuarioEncontrado.get().getPontos() + 1);
            } else {
                if (!usuario.isBlank() && !usuario.isEmpty()) {
                    listUsuarios.add(new Usuario(usuario, 1));
                }
            }
        }
    }

    public void add(String usuario) {
        if (!usuario.isBlank() && !usuario.isEmpty()) {
            Optional<Usuario> usuarioEncontrado = this.findUser(usuario);
            if (usuarioEncontrado.isEmpty()) {
                listUsuarios.add(new Usuario(usuario, 0));
            }
        }
    }

    public Optional<Usuario> findUser(String usuario) {
        Optional<Usuario> usuarioEncontrado = listUsuarios.stream()
                .filter(user -> user.getNome().equals(usuario)).findAny();
        return usuarioEncontrado;
    }

    public List<Usuario> getAll() {
        return listUsuarios.stream()
                .sorted(Comparator.comparing(Usuario::getPontos).reversed())
                .collect(Collectors.toList());
    }

    public Boolean validar(Operacao soma) {
        return soma.getNumber1() + soma.getNumber2() == soma.getResultado();
    }
}
