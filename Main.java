package biblioteca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Direccion direccionEditorial = new Direccion("Av. Libertador", "1234", "Buenos Aires", "C1425");
        
        
        Editorial editorial = new Editorial("Editorial XYZ", "011-4567-8900", "contacto@xyz.com", direccionEditorial);
        
    
        Autor autor1 = new Autor("Jorge Luis", "Borges", "borges@mail.com", "24/08/1899");
        Autor autor2 = new Autor("Julio", "Cortázar", "cortazar@mail.com", "26/08/1914");
        
        
        Genero generoLiteratura = new Genero("Literatura", "Literatura argentina contemporánea");
        
        
        Libro libro = new Libro("Ficciones", 1944, editorial, generoLiteratura);
        libro.agregarAutor(autor1);
        libro.agregarAutor(autor2);
        
        
        Ejemplar ejemplar1 = new Ejemplar("LIB-001", "Estante A1");
        Ejemplar ejemplar2 = new Ejemplar("LIB-002", "Estante A2");
        libro.agregarEjemplar(ejemplar1);
        libro.agregarEjemplar(ejemplar2);
        
        
        Revista revista = new Revista("Revista Cultural", 2023, editorial, 1, 1);
        Ejemplar ejemplarRevista = new Ejemplar("REV-001", "Estante B1");
        revista.agregarEjemplar(ejemplarRevista);
        
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarPublicacion(libro);
        biblioteca.agregarPublicacion(revista);
        
        
        Usuario usuario = new Usuario("Juan", "Pérez", "12345678", "juan@mail.com");
        biblioteca.agregarUsuario(usuario);
        
    
        Prestamo prestamo = new Prestamo();
        prestamo.agregarLineaPrestamo(ejemplar1);
        usuario.agregarPrestamo(prestamo);
        
        
        usuario.mostrarHistorialPrestamos();
    }
} 
