package com.example.alumnos.hn2_task2_alexrodriguez.beans;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 16/03/2017.
 */

public class ItemBean implements Serializable{

    String nombrePersonaje ;
    int foto ;
    String txtDetalle ;

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTxtDetalle() {
        return txtDetalle;
    }

    public void setTxtDetalle(String txtDetalle) {
        this.txtDetalle = txtDetalle;
    }

    public ItemBean(String nombrePersonaje, int foto, String txtDetalle) {
        this.nombrePersonaje = nombrePersonaje;
        this.foto = foto;
        this.txtDetalle = txtDetalle;

    }
}
