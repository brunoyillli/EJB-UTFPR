/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.brunoyillli.primeiroprojetoejb.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author wolft
 */
@Stateless
public class EjbOlaMundo {

    public String getOi(){
        return "Bem vindos a aplicação EJB";
    }
}
