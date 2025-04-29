package biblioteca;

public class Libro extends Publicacion {
    private Genero genero;

    public Libro(String titulo, int anio, Editorial editorial, Genero genero) {
        super(titulo, anio, editorial);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
} 