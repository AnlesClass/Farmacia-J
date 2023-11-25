package BusinessObject;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
public class Boleta {

    private int idBoleta;
    private float importe;
    private LocalDate fechaExpedicion;
    private LocalTime horaExpedicion;

    public String[] lista() {
        var lista = new String[4];
        lista[0] = String.valueOf(idBoleta);
        lista[1] = String.valueOf(importe);
        lista[2] = String.valueOf(fechaExpedicion);
        lista[3] = String.valueOf(horaExpedicion);
        return lista;
    }
}
