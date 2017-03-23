package com.example.alumnos.hn2_task2_alexrodriguez.test;

import com.example.alumnos.hn2_task2_alexrodriguez.R;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.AyudasBean;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.ObjetosBean;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.PersonajeBean;

import java.util.ArrayList;



public class Datos {

    public static ArrayList<PersonajeBean> getPersonajes(){

        ArrayList<PersonajeBean> personajes = new ArrayList<>();

        personajes.add(new PersonajeBean("Nave 1", R.drawable.personaje1, "Detalles"));
        personajes.add(new PersonajeBean("Nave 2", R.drawable.personaje2, "Detalles"));
        personajes.add(new PersonajeBean("Nave ", R.drawable.personaje3, "Detalles"));

        return personajes;

    }

    public static ArrayList<ObjetosBean> getObjetos() {

        ArrayList<ObjetosBean> objetos = new ArrayList<>();

        objetos.add(new ObjetosBean("Objeto 1", R.drawable.objeto1, "Detalles"));
        objetos.add(new ObjetosBean("Objeto 2", R.drawable.objeto2, "Detalles"));
        objetos.add(new ObjetosBean("Objeto 3", R.drawable.objeto3, "Detalles"));

        return  objetos ;
    }

    public static ArrayList<AyudasBean> getAyudas() {

        ArrayList<AyudasBean> ayudas = new ArrayList<>();

        ayudas.add(new AyudasBean("Ayuda 1"));

        return  ayudas ;
    }

}
