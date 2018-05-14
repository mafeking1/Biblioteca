package com.biblioteca;

import com.biblioteca.Publicaciones.Publicacion;
import com.biblioteca.Socios.Socio;

import java.util.List;

public class Biblioteca {

    private List<Publicacion> listaPublicaciones;
    private List<Socio> listaSocios;
    private List<Prestamo> listaPrestamos;

    public Biblioteca(List<Publicacion> listaPublicaciones, List<Socio> listaSocios, List<Prestamo> listaPrestamos) {
        this.listaPublicaciones = listaPublicaciones;
        this.listaSocios = listaSocios;
        this.listaPrestamos = listaPrestamos;
    }

    public List<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(List<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public List<Socio> getListaSocios() {
        return listaSocios;
    }

    public void setListaSocios(List<Socio> listaSocios) {
        this.listaSocios = listaSocios;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public void altaSocio(Socio socio){
        listaSocios.add(socio);
    }

    public void nuevaPublicacion(Publicacion publicacion){
        listaPublicaciones.add(publicacion);
    }

    public void prestamoEjemplar(Long codigoIsbn, Integer numeroSocio){
        for (Publicacion publicacion : listaPublicaciones) {
            if (publicacion.getCodigoIsbn() == codigoIsbn){
                if (publicacion.tieneEjemplaresDisponibles()){
                    for (Socio socio : listaSocios) {
                        if (socio.getNumeroSocio() == numeroSocio){
                            if (socio.puedeSolicitarPrestamo() == true){

                            }
                        }
                    }
                }
            }
        }
    }
}
