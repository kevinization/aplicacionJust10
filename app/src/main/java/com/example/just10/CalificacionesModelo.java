package com.example.just10;

public class CalificacionesModelo {
    private String Nombre, Cal1;

    public CalificacionesModelo() {
    }

    public CalificacionesModelo(String nombre, String cal1) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
