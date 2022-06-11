/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concurso;

import com.mycompany.entidades.Historial;
import com.mycompany.servicios.Menu;

/**
 *
 * @author Jhoan Gaviria
 */
public class Main {
    
        public static void main(String[] args) throws InterruptedException {
            
            Menu m = new Menu();
            Historial h =  m.ingresarUsuario();
            //System.out.println(h.getNombrejugador() + " " +h.getPuntaje());
            m.iniciarJuego(h);
            
            
        }
    
}
