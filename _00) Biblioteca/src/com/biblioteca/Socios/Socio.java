package com.biblioteca.Socios;

import com.biblioteca.Ejemplar;

import java.util.ArrayList;
import java.util.List;

public class Socio {

    private Integer numeroSocio;
    private String nombre;
    private String apellido;
    private String direccion;
    private List<Ejemplar> listaEjemplaresRetirados;
    private Integer limiteEjemplaresRetirados;

    public Socio(Integer numeroSocio, String nombre, String apellido, String direccion) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.listaEjemplaresRetirados = new ArrayList<>();
        this.limiteEjemplaresRetirados = 3;
    }

    public Integer getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(Integer numeroSocio) {
        this.numeroSocio = numeroSocio;
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

    public Integer getLimiteEjemplaresRetirados() {
        return limiteEjemplaresRetirados;
    }

    public void setLimiteEjemplaresRetirados(Integer limiteEjemplaresRetirados) {
        this.limiteEjemplaresRetirados = limiteEjemplaresRetirados;
    }

    public boolean puedeSolicitarPrestamo(){
        if(listaEjemplaresRetirados.size() > limiteEjemplaresRetirados) {
            return true;
        }else{
            return false;
        }
    }

    public void agregarEjemplar(Ejemplar ejemplar){
        ejemplar.setPrestado(true);
        listaEjemplaresRetirados.add(ejemplar);
    }

    public void removerEjemplar(Ejemplar ejemplar){
        ejemplar.setPrestado(false);
        listaEjemplaresRetirados.remove(ejemplar);
    }
}
