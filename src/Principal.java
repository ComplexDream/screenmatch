import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
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

//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre="matrix";
//        otraPelicula.fechaDeLanzamiento= 1998;
//        otraPelicula.duracionEnMinutos=180;
//        otraPelicula.muestraFichaTecnica();


    }
}
