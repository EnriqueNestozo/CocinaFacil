package com.nestozo.enriq.cocinafacil;

public class Account {
    private static String nombre;
    private static String contrasena;
    private static Account cuenta;

    private Account(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public static String getContrasena() {
        return contrasena;
    }

    public static String getnombre() {
        return nombre;
    }

    public static Account getAccountInstance(String nombre, String contrasena){
        if(cuenta==null){
            cuenta = new Account(nombre, contrasena);
        }
        return cuenta;
    }

}
