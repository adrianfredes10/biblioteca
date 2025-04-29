package biblioteca;

import java.util.Date;

public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private String ubicacion;

    public Ejemplar(String codigo, String ubicacion) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.estado = EstadoEjemplar.DISPONIBLE;
    }

    public boolean estaDisponible() {
        return this.estado == EstadoEjemplar.DISPONIBLE;
    }

    public String getCodigo() {
        return codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }
} 