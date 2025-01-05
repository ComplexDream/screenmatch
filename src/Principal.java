import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        //lo de arriba es un constructor y sirve para reservar un espacio en memoria para poder darle atributos
        //en este caso, a esa pelicula
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10.0);

        System.out.println(miPelicula.getSumaDeLasEvaluaciones());
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.muestraFichaTecnica();



        Serie casaDragon = new Serie();
        casaDragon.setNombre("la casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionEnMinutos());
        casaDragon.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("El tiempo necesario para ver otras peliculas es: "+calculadora.getTiempoTotal()+ "minutos");

        FiltroRecomendacion filtroRecomendacion=new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio= new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);


        var peliculaDeBruno = new Pelicula();
        peliculaDeBruno.setNombre("El señor de los anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("tamaño de la lista : "+ listaDePeliculas.size());
        System.out.println("La primera pelicula es : "+ listaDePeliculas.get(0).getNombre());

//        System.out.println(listaDePeliculas);
//        el resultado es: [com.aluracursos.screenmatch.modelos.Pelicula@5b6f7412, com.aluracursos.screenmatch.modelos.Pelicula@27973e9b, com.aluracursos.screenmatch.modelos.Pelicula@312b1dae]
        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula: "+ listaDePeliculas.get(0).toString());



    }
}
