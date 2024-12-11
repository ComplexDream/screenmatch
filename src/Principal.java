public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre="Encanto";
        miPelicula.fechaDeLanzamiento=2021;
        miPelicula.duracionEnMinutos=120;

        System.out.println("mi pelicula es: "+miPelicula.nombre);
        System.out.println("su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre="matrix";
        otraPelicula.fechaDeLanzamiento= 1998;
        otraPelicula.duracionEnMinutos=180;
        System.out.println("mi pelicula es: "+otraPelicula.nombre);
        System.out.println("su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);




    }
}
