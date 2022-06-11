//PARÁMETROS: RONDA, PREMIO, ACUMULADO 
package com.mycompany.servicios;

import com.mycompany.entidades.Historial;
import com.mycompany.entidades.Respuesta;
import com.mycompany.persistencia.PreguntaDAO;
import com.mycompany.persistencia.RespuestaDAO;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Menu {
    public Integer ronda = 1;
    
    public Historial ingresarUsuario(){
        String nombre;
        
        System.out.println("**********************  BIENVENIDO   ***************************\n \n");
        System.out.println("Para iniciar el juego debe ingresar su nombre: \n");
        Scanner lectura = new Scanner(System.in);
        nombre = lectura.next();
        //System.out.println(nombre);
     
        return new Historial(nombre,0);
    }
    
    public void iniciarJuego(Historial jugador){
        String respuestaJugador;
        int puntaje = jugador.getPuntaje();
        int nuevoPuntaje = 0;
        System.out.println(" Hola, "+jugador.getNombrejugador()+".\n Este juego consiste en 5 rondas de preguntas con 4 posibles respuestas en las que podrás acumular un puntaje.\n Después de cada ronda podrás retirarte con el puntaje acumulado, pero si fallas lo perderás.\n");
    // while(this.ronda<=4){
    
            System.out.println("Esta pregunta corresponde a la ronda "+this.ronda+" y su premio corresponde a "+this.ronda*500);
            
            Random rand = new Random();
            int int_rand = rand.nextInt(4);
            
            PreguntaDAO pregunta = new PreguntaDAO();
            
            System.out.println(pregunta.obtenerPregunta(ronda, int_rand).getPregunta());
            
            RespuestaDAO respuesta = new RespuestaDAO();
            ArrayList<Respuesta> respuestas = (ArrayList<Respuesta>) respuesta.obtenerRespuesta(ronda, int_rand);
            for (int i=0; i<=3;i++)
            {
                System.out.println(respuestas.get(i).getRespuesta()+"\n");
            }
            
            System.out.println("Ingrese su respuesta: \n");
            Scanner lectura = new Scanner(System.in);
            respuestaJugador = lectura.next();
            
            
            if(respuestaJugador.equals(respuestas.get(4).getRespuesta()))
            {
                nuevoPuntaje = puntaje+ronda*500;
                System.out.println("La respuesta es correcta");
                System.out.println("Su nuevo puntaje es "+nuevoPuntaje+ "Desea continuar");
                
            }
            else{
                System.out.println("La respuesta es incorrecta");
                System.out.println("Su puntaje es: "+puntaje);
                System.out.println("Gracias por participar");
            }
            
            
            puntaje = nuevoPuntaje;
    //}
    }
    

    
}
