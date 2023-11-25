package BusinessObject;

public class DetallePedido {

    private int idDetalle;
    private int cantidad;
    private float precioUnitario;

    public String[] lista() {
        var lista = new String[3];
        lista[0] = String.valueOf(idDetalle);
        lista[1] = String.valueOf(cantidad);
        lista[2] = String.valueOf(precioUnitario);
        return lista;
    }
}
