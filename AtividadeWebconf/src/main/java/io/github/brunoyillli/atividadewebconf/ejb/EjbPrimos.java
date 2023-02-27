/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.brunoyillli.atividadewebconf.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author wolft
 */
@Stateless
public class EjbPrimos implements EjbPrimosLocal {

    @Override
    public int nextPrimo(Integer numero) {
        while (!isPrime(numero)) {
            numero++;
        }
        return numero;
    }

    public static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
