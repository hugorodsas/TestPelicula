public class TestPelicula {
    public static  void main(String[] args){
        Pelicula pelicula = new Pelicula("Los hombre de hierro","Skaspierre",180);

        System.out.println("Datos de la pelicula");
        pelicula.MostrarInformacion();

        pelicula.setTitulo("Manolos");
        pelicula.setDirector("Manolo");
        try {
            pelicula.setDuracionMinutos(0);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println(pelicula);

        System.out.println("Titulo: "+pelicula.getTitulo());
        System.out.println("Director: "+pelicula.getDirector());
        System.out.println("Duracion Minutos: "+pelicula.getDuracionMinutos());
    }
}
