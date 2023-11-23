package BusinessObject;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Pedido{
	private int idPedido;
	private ArrayList<Producto> listaPedido;
}
