/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.brunoyillli.ejbtimer.ejb;

import java.util.Date;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

/**
 *
 * @author wolft
 */
@Stateless
public class EjbTimer {
 
    @Schedule(second = "*/10", hour = "*", minute = "*")
    public void metodo1(){
        System.out.println("metodo 1" + ";" + new Date());
    }
    
}