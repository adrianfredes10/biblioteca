package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
} 