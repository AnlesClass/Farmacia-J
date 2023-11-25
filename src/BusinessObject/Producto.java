package BusinessObject;

import lombok.Data;

@Data
public class Producto {

    private int idProducto;
    private String nombre;
    private String tipoProducto;
    private String descripcion;
    private boolean ventaConReceta;
    private float precio;
}
