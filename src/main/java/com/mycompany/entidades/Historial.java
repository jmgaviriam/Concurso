
package com.mycompany.entidades;


public class Historial{
    public final String nombrejugador;
    public int ronda;
    private final int puntaje;
    public boolean getNombrejugador;

    public Historial(String nombrejugador, int puntaje, int ronda) {
        this.nombrejugador = nombrejugador;
        this.puntaje = puntaje;
    }

    public String getNombrejugador() {
        return nombrejugador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getRonda() {
        return ronda;
    }

   
    
}
