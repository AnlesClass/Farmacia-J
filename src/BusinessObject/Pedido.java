package BusinessObject;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Pedido {

    private int idPedido;
    private LocalDate fechaPedido;
    
     public String[] lista() {
        var lista = new String[2];
        lista[0] = String.valueOf(idPedido);
        lista[1] = String.valueOf(fechaPedido);
        return lista;
    }
}
