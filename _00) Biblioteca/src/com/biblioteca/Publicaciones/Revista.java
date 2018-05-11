package com.biblioteca.Publicaciones;

import java.util.Date;

public class Revista extends Publicacion {

    private Date fechaPublicacion;

    public Revista(String nombre, Long codigoIsbn, String autor, Date fechaPublicacion) {
        super(nombre, codigoIsbn, autor);
        this.fechaPublicacion = fechaPublicacion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
