import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.prestamos = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void mostrarHistorialPrestamos() {
        System.out.println("Historial de préstamos para " + nombre + " " + apellido + ":");
        for (Prestamo prestamo : prestamos) {
            System.out.println("\nPréstamo del " + prestamo.getFechaPrestamo());
            System.out.println("Ejemplares:");
            for (LineaPrestamo linea : prestamo.getLineas()) {
                System.out.println("- Código: " + linea.getEjemplar().getCodigo() + 
                                 ", Fecha devolución estimada: " + linea.getFechaDevolucionEstimada());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
} 