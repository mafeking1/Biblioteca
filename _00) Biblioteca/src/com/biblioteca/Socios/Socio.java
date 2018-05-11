package com.biblioteca.Socios;

import com.biblioteca.Ejemplar;

import java.util.ArrayList;
import java.util.List;

public class Socio {

    private String nombre;
    private String apellido;
    private String direccion;
    private List<Ejemplar> listaEjemplaresRetirados;

    public Socio(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.listaEjemplaresRetirados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Ejemplar> getListaEjemplaresRetirados() {
        return listaEjemplaresRetirados;
    }

    public void setListaEjemplaresRetirados(List<Ejemplar> listaEjemplaresRetirados) {
        this.listaEjemplaresRetirados = listaEjemplaresRetirados;
    }
}
