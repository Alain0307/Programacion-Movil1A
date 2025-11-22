/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionusuarios;

/**
 *
 * Alain Cesar Raymundo
 */
public class Usuario {
    private String nombre;
    private String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombre + "," + correo;
    }

    public static Usuario fromString(String linea) {
        String[] partes = linea.split(",");
        if (partes.length == 2) {
            return new Usuario(partes[0], partes[1]);
        }
        return null;
    }
}
