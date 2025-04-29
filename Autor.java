package biblioteca;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private String fechaNacimiento;

    public Autor(String nombre, String apellido, String email, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
} 