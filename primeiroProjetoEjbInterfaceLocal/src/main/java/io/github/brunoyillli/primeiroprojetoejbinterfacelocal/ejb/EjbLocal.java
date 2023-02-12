/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.brunoyillli.primeiroprojetoejbinterfacelocal.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author wolft
 */
@Stateless
public class EjbLocal implements EjbLocalLocal {

    @Override
    public int dobrar(int valor){
        return valor*2;
    }
}
