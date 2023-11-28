package BusinessObject;

import lombok.Data;

@Data
public class DetallePedido {

    private int idDetalle;
    private int idPedido;
    private int idProducto;
    private int cantidad;
    private float precioUnitario;

    public String[] lista() {
        var lista = new String[3];
        lista[0] = String.valueOf(idDetalle);
        lista[1] = String.valueOf(idPedido);
        lista[2] = String.valueOf(idProducto);
        lista[3] = String.valueOf(cantidad);
        lista[4] = String.valueOf(precioUnitario);
        return lista;
    }
}
