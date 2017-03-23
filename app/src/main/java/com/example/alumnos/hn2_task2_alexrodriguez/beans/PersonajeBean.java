package com.example.alumnos.hn2_task2_alexrodriguez.beans;


import java.io.Serializable;

public class PersonajeBean extends ItemBean implements Serializable {


    public PersonajeBean(String nombrePersonaje, int foto, String txtDetalle) {
        super(nombrePersonaje, foto, txtDetalle);
    }
}
