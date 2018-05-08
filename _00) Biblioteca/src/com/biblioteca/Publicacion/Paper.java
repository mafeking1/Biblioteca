package com.biblioteca.Publicacion;

import com.biblioteca.Ejemplar;

import java.util.Date;
import java.util.List;

public class Paper extends Publicacion {

    private String titulo;
    private String autores;
    private Date fechaPublicacion;
    private String resumen;
    private List<Ejemplar> listaEjemplaresParaPrestar;

    public Paper(String titulo, Long codigoIsbn, String autores, Date fechaPublicacion, String resumen, List<Ejemplar> listaEjemplaresParaPrestar) {
        this.titulo = titulo;
        super.setCodigoIsbn(codigoIsbn);
        this.autores = autores;
        this.fechaPublicacion = fechaPublicacion;
        this.resumen = resumen;
        this.listaEjemplaresParaPrestar = listaEjemplaresParaPrestar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public List<Ejemplar> getListaEjemplaresParaPrestar() {
        return listaEjemplaresParaPrestar;
    }

    public void setListaEjemplaresParaPrestar(List<Ejemplar> listaEjemplaresParaPrestar) {
        this.listaEjemplaresParaPrestar = listaEjemplaresParaPrestar;
    }
}
