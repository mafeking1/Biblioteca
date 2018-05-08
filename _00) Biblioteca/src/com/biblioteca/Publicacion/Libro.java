package com.biblioteca.Publicacion;

import com.biblioteca.Ejemplar;

import java.util.List;

public class Libro extends Publicacion {

    private String nombre;
    private String autor;
    private List<Ejemplar> listaEjemplaresParaPrestar;

    public Libro(String nombre, Long codigoIsbn, String autor, List<Ejemplar> listaEjemplaresParaPrestar) {
        this.nombre = nombre;
        super.setCodigoIsbn(codigoIsbn);
        this.autor = autor;
        this.listaEjemplaresParaPrestar = listaEjemplaresParaPrestar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Ejemplar> getListaEjemplaresParaPrestar() {
        return listaEjemplaresParaPrestar;
    }

    public void setListaEjemplaresParaPrestar(List<Ejemplar> listaEjemplaresParaPrestar) {
        this.listaEjemplaresParaPrestar = listaEjemplaresParaPrestar;
    }
}
