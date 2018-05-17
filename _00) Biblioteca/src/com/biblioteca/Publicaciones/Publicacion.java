package com.biblioteca.Publicaciones;

import com.biblioteca.Ejemplar;

import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {

    private String nombre;
    private Long codigoIsbn;
    private String autor;
    private List<Ejemplar> listaEjemplaresParaPrestar;

    public Publicacion(String nombre, Long codigoIsbn, String autor) {
        this.nombre = nombre;
        this.codigoIsbn = codigoIsbn;
        this.autor = autor;
        this.listaEjemplaresParaPrestar = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setCodigoIsbn(Long codigoIsbn) {
        this.codigoIsbn = codigoIsbn;
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

    public boolean tieneEjemplaresDisponibles(){
        if (listaEjemplaresParaPrestar.size() > 0){
            for (Ejemplar ejemplar : listaEjemplaresParaPrestar) {
                if(ejemplar.getPrestado() == false){
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }

    public void agregarEjemplar(Ejemplar ejemplar){
        listaEjemplaresParaPrestar.add(ejemplar);
    }

    public Ejemplar prestarEjemplar(){
        for (Ejemplar ejemplar : listaEjemplaresParaPrestar){
            listaEjemplaresParaPrestar.remove(ejemplar);
            return ejemplar;
        }
        return null;
    }


}
