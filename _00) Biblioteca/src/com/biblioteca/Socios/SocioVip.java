package com.biblioteca.Socios;

public class SocioVip extends Socio {

    private Double cuotaMensual;

    public SocioVip(String numero, String nombre, String apellido, String direccion, Double cuotaMensual) {
        super(numero, nombre, apellido, direccion);
        this.setLimiteEjemplaresRetirados(15);
        this.cuotaMensual = cuotaMensual;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
}
