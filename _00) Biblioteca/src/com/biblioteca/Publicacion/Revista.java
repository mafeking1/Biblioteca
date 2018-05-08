package com.biblioteca.Publicacion;

import com.biblioteca.Ejemplar;

import java.util.Date;
import java.util.List;

public class Revista extends Publicacion {

    private String nombre;
    private Date fechaPublicacion;
    private List<Ejemplar> listaEjemplaresParaPrestar;

    public Revista(String nombre, Long codigoIsbn, Date fechaPublicacion, List<Ejemplar> listaEjemplaresParaPrestar) {
        this.nombre = nombre;
        super.setCodigoIsbn(codigoIsbn);
        this.fechaPublicacion = fechaPublicacion;
        this.listaEjemplaresParaPrestar = listaEjemplaresParaPrestar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public List<Ejemplar> getListaEjemplaresParaPrestar() {
        return listaEjemplaresParaPrestar;
    }

    public void setListaEjemplaresParaPrestar(List<Ejemplar> listaEjemplaresParaPrestar) {
        this.listaEjemplaresParaPrestar = listaEjemplaresParaPrestar;
    }
}
