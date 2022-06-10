//SE DEBE CREAR UN MÉTODO QUE INSTANCIE A LA CLASE RESPUESTA Y RETORNE UN OBJETO TIPO RESPUESTA EN LA CLASE SERVICIOS

package com.mycompany.persistencia;


import com.mycompany.entidades.Respuesta;

import java.io.*;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class RespuestaDAO {

    //private int ronda;

    public List<Respuesta> obtenerRespuesta(Integer ronda, Integer aleatorio) {
        BufferedReader obj;
        File fr;
        List<String> listaRespuestas = new ArrayList<>();
        
        File txtfile = new File("txt\\Answers"+ronda+".txt");

        try{
            obj = new BufferedReader(new FileReader(txtfile));

            String read;
            while ((read = obj.readLine()) != null) {
                //System.out.println(read);
                listaRespuestas.add(read);
            }
        }
        catch(IOException ioe){
            System.out.println("Error");
        }
       
        
        String[] respuestaFinal =  listaRespuestas.get(aleatorio).split("\\s+");
        ArrayList<Respuesta> respuestas = new ArrayList<>();
        
        for(int k = 0; k<=4; k++){
            respuestas.add(new Respuesta(respuestaFinal[k], k==4));            
        }
        return respuestas;
    }
}