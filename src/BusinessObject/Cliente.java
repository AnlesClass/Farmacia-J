package BusinessObject;

import lombok.Data;

@Data
public class Cliente {

    //private int idCliente;
    private String dni;
    private int edad;
    private String nombre;
    private String apellido;
    private String telefono;
}
