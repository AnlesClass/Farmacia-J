package BusinessObject;

import lombok.Data;

@Data
public class Cliente {

    private int idCliente;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
}
