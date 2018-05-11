package com.biblioteca;

import com.biblioteca.Publicacion.Publicacion;

public class Ejemplar {

    private Publicacion publicacion;
    private Integer numeroEdicion;
    private Integer numeroIdentificacion;
    private String comentario;

    public Ejemplar(Publicacion publicacion, Integer numeroEdicion, Integer numeroIdentificacion, String comentario) {
        this.publicacion = publicacion;
        this.numeroEdicion = numeroEdicion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.comentario = comentario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Integer getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(Integer numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
