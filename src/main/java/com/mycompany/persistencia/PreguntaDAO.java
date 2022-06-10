//SE DEBE CREAR UN MÉTODO QUE INSTANCIE A LA CLASE PREGUNTA Y RETORNE UN OBJETO TIPO PREGUNTA EN LA CLASE SERVICIOS
package com.mycompany.persistencia;

import com.mycompany.entidades.Pregunta;

import java.io.*;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class PreguntaDAO {

    //private int ronda;

    public Pregunta obtenerPregunta(Integer ronda, Integer aleatorio) {
        BufferedReader obj;
        BufferedReader in;
        File fr;
        List<String> listaPreguntas = new ArrayList<>();
        
        File txtfile = new File("txt\\Questions"+ronda+".txt");

        try{
            obj = new BufferedReader(new FileReader(txtfile));

            String read;
            while ((read = obj.readLine()) != null) {
                //System.out.println(read);
                listaPreguntas.add(read);
            }
        }
        catch(IOException ioe){
            System.out.println("Error");
        }
       
        String preguntaFinal = listaPreguntas.get(aleatorio);
        
        return new Pregunta(ronda, preguntaFinal);
    }
}
