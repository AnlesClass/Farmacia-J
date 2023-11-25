package BusinessObject;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
public class Factura {

    private int idFactura;
    private String nombreCliente;
    private int ruc;
    private float importe;
    private int telefono;
    private LocalDate fechaExpedicion;
    private LocalTime horaExpedicion; 
}
