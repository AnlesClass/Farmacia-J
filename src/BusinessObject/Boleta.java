package BusinessObject;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
public class Boleta {

    //private int idBoleta;
    private LocalDate fechaExpedicion;
    private LocalTime horaExpedicion;
    private float importe;
}
