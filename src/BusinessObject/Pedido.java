package BusinessObject;

import java.time.LocalDate;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Pedido {

    private int idPedido;
    private LocalDate fechaPedido;
}
