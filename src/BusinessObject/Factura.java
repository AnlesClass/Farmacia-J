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
    
    public String[] lista() {
        var lista = new String[7];
        lista[0] = String.valueOf(idFactura);
        lista[1] = nombreCliente;
        lista[2] = String.valueOf(ruc);
        lista[3] = String.valueOf(importe);
        lista[4] = String.valueOf(telefono);
        lista[5] = String.valueOf(fechaExpedicion);
        lista[6] = String.valueOf(horaExpedicion);
        return lista;
    }
}
