/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.brunoyillli.ejbsomardoisnumeros.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Bruno Mendes Carvalho
 */
@Stateless
public class EjbSomar implements EjbSomarLocal{

    @Override
    public double somar(Double numeroA, Double numeroB) {
        return numeroA + numeroB;
    }


}
