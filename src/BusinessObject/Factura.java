package BusinessObject;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
public class Factura {

    //private int idFactura;
    private int ruc;
    private int telefono;
    private String nombreCliente;
    private LocalDate fechaExpedicion;
    private LocalTime horaExpedicion;
    private float importe;
}
