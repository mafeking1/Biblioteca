package com.biblioteca;

import com.biblioteca.Publicaciones.Publicacion;

public class Ejemplar {

    private Publicacion publicacion;
    private Integer numeroEdicion;
    private String numeroIdentificacion;
    private String comentario;
    private Boolean prestado;

    public Ejemplar(Publicacion publicacion, Integer numeroEdicion, String numeroIdentificacion, String comentario, Boolean prestado) {
        this.publicacion = publicacion;
        this.numeroEdicion = numeroEdicion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.comentario = comentario;
        this.prestado = prestado;
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

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }
}
