
package com.mycompany.persistencia;

//import com.mycompany.entidades.Historial;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HistorialDAO {
    
    public void guardarRegistro(String nombre, int puntaje){
        String registro = "Jugador: "+nombre+";"+"Puntaje: "+puntaje+"\n";
        String path = "txt\\Registro.txt";
        
        try {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(path, true))) {
                out.write(registro);
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error");
        }
    }
    
}
