package com.biblioteca.Publicacion;

import com.biblioteca.Ejemplar;

import java.util.Date;
import java.util.List;

public class Paper extends Publicacion implements Imprimible{

    private Date fechaPublicacion;
    private String resumen;

    public Paper(String nombre, Long codigoIsbn, String autor, Date fechaPublicacion, String resumen) {
        super(nombre, codigoIsbn, autor);
        this.fechaPublicacion = fechaPublicacion;
        this.resumen = resumen;
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

    @Override
    public Ejemplar imprimir() {
        // acá debería ir algo que recorra el array de papers leyendo los numeros de identificación para hacerlo incremental
        Ejemplar ejemplar = new Ejemplar(this, 999, "local-", null, false);
        return ejemplar;
    }
}
