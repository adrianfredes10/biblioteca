import java.util.Calendar;
import java.util.Date;

public class LineaPrestamo {
    private Date fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamo(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
        //  fecha de devolucion estimada a 15 días despues
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 15);
        this.fechaDevolucionEstimada = calendar.getTime();
    }

    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }
} 
