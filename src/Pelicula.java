public class Pelicula {
    private String titulo;
    private String director;
    private int duracionMinutos;

    public Pelicula(String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }

    public void MostrarInformacion(){
        System.out.println(toString());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo==null||titulo.trim().isEmpty()){
            throw new IllegalArgumentException("El titulo no puede estar vacio o nulo");
        }
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if(director==null||director.trim().isEmpty()){
            throw new IllegalArgumentException("El director no puede estar vacio o nulo");
        }
        this.director = director;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if (duracionMinutos<=0){
            throw new IllegalArgumentException("Tiene que ser mayor que cero");
        }
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Pelicula{"+
                "titulo='"+titulo+"\'"+
                ", director='"+director+'\''+
                ", duracionMinutos="+duracionMinutos+
                '}';
    }
}
