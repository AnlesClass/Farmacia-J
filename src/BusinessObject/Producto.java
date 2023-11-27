package BusinessObject;

import lombok.Data;

@Data
public class Producto {
//ATRIBUTOS NUEVOS

    private int idProducto;
    private int idTipoProducto;
    private String nombre;
    private String descripcion;
    private boolean ventaConReceta;
    private float precio;
    private boolean activo;

    public String[] lista() {
        var lista = new String[6];
        lista[0] = String.valueOf(idProducto);
        lista[1] = String.valueOf(idTipoProducto);
        lista[2] = nombre;
        lista[3] = descripcion;
        lista[4] = String.valueOf(ventaConReceta);
        lista[5] = String.valueOf(precio);
        lista[6] = String.valueOf(activo);
        return lista;
    }
}
