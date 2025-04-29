package biblioteca;

public class Editorial {
    private String nombre;
    private String telefono;
    private String email;
    private Direccion direccion;

    public Editorial(String nombre, String telefono, String email, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Direccion getDireccion() {
        return direccion;
    }
} 