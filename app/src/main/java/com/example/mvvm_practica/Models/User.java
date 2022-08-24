package com.example.mvvm_practica.Models;

public class User {

    private String nombre;
    private String Correo;
    private int edad;

    public User(String nombre, String correo, int edad) {
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getEdad() {
        return edad;
    }
}
