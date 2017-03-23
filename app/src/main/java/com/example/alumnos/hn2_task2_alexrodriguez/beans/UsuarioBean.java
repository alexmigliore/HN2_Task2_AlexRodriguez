package com.example.alumnos.hn2_task2_alexrodriguez.beans;

import com.google.gson.Gson;

import java.io.Serializable;


    public class UsuarioBean implements Serializable {
        private String email, nombre, pass;

        public UsuarioBean(String email, String nombre, String pass) {

            this.email = email;
            this.nombre = nombre;
            this.pass = pass;
        }

        public UsuarioBean() {
        }


        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String toJson(){
            Gson gson = new Gson();
            return gson.toJson(this);
        }

        public static UsuarioBean fromJson(String json){
            if(json!=null && !json.isEmpty()) {
                Gson gson = new Gson();
                return gson.fromJson(json, UsuarioBean.class);
            }else{
                return new UsuarioBean();
            }
        }
    }


