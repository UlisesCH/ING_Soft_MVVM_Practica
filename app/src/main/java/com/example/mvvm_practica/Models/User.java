package com.example.mvvm_practica.Models;

public class User {

    private String nombre;
    private String Correo;
    private String edad;

    public User(String nombre, String correo, String edad) {
        this.nombre = nombre;
        Correo = correo;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getEdad() {
        return edad;
    }
}
