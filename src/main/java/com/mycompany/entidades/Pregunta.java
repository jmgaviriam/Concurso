
package com.mycompany.entidades;


public class Pregunta {
    public final Integer premio;
    
    private Integer ronda;
    //private List<String> pregunta = new ArrayList<>();
    private String pregunta;

    public Pregunta(Integer ronda, String pregunta) {
        this.ronda = ronda;
        this.premio = ronda*500;
        this.pregunta = pregunta;
    }

    public Integer getRonda() {
        return ronda;
    }

    public String getPregunta() {
        return pregunta;
    }

    public Integer getPremio() {
        return premio;
    }
    
    
    
    
    
    
    
    
}
