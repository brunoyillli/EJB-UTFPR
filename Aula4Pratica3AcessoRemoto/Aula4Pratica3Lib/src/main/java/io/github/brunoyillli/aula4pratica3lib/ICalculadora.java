/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.brunoyillli.aula4pratica3lib;

import javax.ejb.Remote;

/**
 *
 * @author wolft
 */
@Remote
public interface ICalculadora {
    public int somar(int a, int b);
}
