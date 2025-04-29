package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Publicacion {
    protected String titulo;
    protected int anio;
    protected Editorial editorial;
    protected List<Ejemplar> ejemplares;
    protected List<Autor> autores;

    public Publicacion(String titulo, int anio, Editorial editorial) {
        this.titulo = titulo;
        this.anio = anio;
        this.editorial = editorial;
        this.ejemplares = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public List<Ejemplar> getEjemplaresDisponibles() {
        return ejemplares.stream()
                .filter(Ejemplar::estaDisponible)
                .collect(Collectors.toList());
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public List<Autor> getAutores() {
        return autores;
    }
} 