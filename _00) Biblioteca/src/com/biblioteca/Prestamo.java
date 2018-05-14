package com.biblioteca;

import com.biblioteca.Socios.Socio;

import java.util.Date;

public class Prestamo {

    private Ejemplar ejemplar;
    private Socio socio;
    private Date fechaDeRetiro;

    public Prestamo(Ejemplar ejemplar, Socio socio, Date fechaDeRetiro) {
        this.ejemplar = ejemplar;
        this.socio = socio;
        this.fechaDeRetiro = fechaDeRetiro;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Date getFechaDeRetiro() {
        return fechaDeRetiro;
    }

    public void setFechaDeRetiro(Date fechaDeRetiro) {
        this.fechaDeRetiro = fechaDeRetiro;
    }
}
