package BusinessObject;

import lombok.Data;

@Data
public class Producto {
//ATRIBUTOS
    private int idProducto;
    private String nombre;
    private String tipoProducto;
    private String descripcion;
    private boolean ventaConReceta;
    private float precio;
    
     public String[] lista() {
        var lista = new String[6];
        lista[0] = String.valueOf(idProducto);
        lista[1] = nombre;
        lista[2] = tipoProducto;
        lista[3] = descripcion;
        lista[4] = String.valueOf(ventaConReceta);
        lista[5] = String.valueOf(precio);
        return lista;
    }
}
