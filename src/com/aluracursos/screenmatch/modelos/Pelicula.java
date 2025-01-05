package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends  Titulo implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);
    }

    @Override
    public String toString() {
        return "pelicula: " + this.getNombre() + "("+ getFechaDeLanzamiento() +")";
        //return super.toString();
        //super significa que hacer referencia a un metodo de la clase madre
    }
}
//nos quedamos en parte 2 de listas video 2
