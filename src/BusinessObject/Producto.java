package BusinessObject;

import lombok.Data;

@Data
public class Producto{
	private int idProducto;
	private String tipoProducto;
	private String descripcion;
	private float precio;
	private boolean ventaConReceta;
}
