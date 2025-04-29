package biblioteca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una dirección para la editorial
        Direccion direccionEditorial = new Direccion("Av. Libertador", "1234", "Buenos Aires", "C1425");
        
        // Crear una editorial
        Editorial editorial = new Editorial("Editorial XYZ", "011-4567-8900", "contacto@xyz.com", direccionEditorial);
        
        // Crear autores
        Autor autor1 = new Autor("Jorge Luis", "Borges", "borges@mail.com", "24/08/1899");
        Autor autor2 = new Autor("Julio", "Cortázar", "cortazar@mail.com", "26/08/1914");
        
        // Crear un género
        Genero generoLiteratura = new Genero("Literatura", "Literatura argentina contemporánea");
        
        // Crear un libro
        Libro libro = new Libro("Ficciones", 1944, editorial, generoLiteratura);
        libro.agregarAutor(autor1);
        libro.agregarAutor(autor2);
        
        // Crear ejemplares para el libro
        Ejemplar ejemplar1 = new Ejemplar("LIB-001", "Estante A1");
        Ejemplar ejemplar2 = new Ejemplar("LIB-002", "Estante A2");
        libro.agregarEjemplar(ejemplar1);
        libro.agregarEjemplar(ejemplar2);
        
        // Crear una revista
        Revista revista = new Revista("Revista Cultural", 2023, editorial, 1, 1);
        Ejemplar ejemplarRevista = new Ejemplar("REV-001", "Estante B1");
        revista.agregarEjemplar(ejemplarRevista);
        
        // Crear una biblioteca y registrar las publicaciones
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarPublicacion(libro);
        biblioteca.agregarPublicacion(revista);
        
        // Crear un usuario y registrarlo
        Usuario usuario = new Usuario("Juan", "Pérez", "12345678", "juan@mail.com");
        biblioteca.agregarUsuario(usuario);
        
        // Crear un préstamo con una línea de préstamo
        Prestamo prestamo = new Prestamo();
        prestamo.agregarLineaPrestamo(ejemplar1);
        usuario.agregarPrestamo(prestamo);
        
        // Mostrar el historial de préstamos del usuario
        usuario.mostrarHistorialPrestamos();
    }
} 