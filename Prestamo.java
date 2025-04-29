import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private Date fechaPrestamo;
    private List<LineaPrestamo> lineas;

    public Prestamo() {
        this.fechaPrestamo = new Date();
        this.lineas = new ArrayList<>();
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        LineaPrestamo lineaPrestamo = new LineaPrestamo(ejemplar);
        lineas.add(lineaPrestamo);
        ejemplar.setEstado(EstadoEjemplar.PRESTADO);
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public List<LineaPrestamo> getLineas() {
        return lineas;
    }
} 