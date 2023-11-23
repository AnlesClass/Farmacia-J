package BusinessObject;

import lombok.Data;

@Data
public class Cliente{
	private int idCliente;
	private String DNI;
	private int edad;
	private String nombre;
	private String apellido;
	private String telefono;
}
