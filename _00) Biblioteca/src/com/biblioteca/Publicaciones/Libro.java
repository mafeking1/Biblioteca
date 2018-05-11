package com.biblioteca.Publicaciones;

import com.biblioteca.Ejemplar;

public class Libro extends Publicacion implements Imprimible {

    public Libro(String nombre, Long codigoIsbn, String autor) {
        super(nombre, codigoIsbn, autor);
    }

    @Override
    public Ejemplar imprimir() {
        // acá debería ir algo que recorra el array de libros leyendo los numeros de identificación para hacerlo incremental
        Ejemplar ejemplar = new Ejemplar(this, 999, "local-", null, false);
        return ejemplar;
    }
}
