package com.nestozo.enriq.cocinafacil;

public class Account {
    private String nombre;
    private String contrasena;

    public Account(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getnombre() {
        return nombre;
    }

}
