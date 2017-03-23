package com.example.alumnos.hn2_task2_alexrodriguez.beans;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 16/03/2017.
 */

public class ObjetosBean extends  ItemBean implements Serializable {


    public ObjetosBean(String nombrePersonaje, int foto, String txtDetalle) {
        super(nombrePersonaje, foto, txtDetalle);
    }
}
