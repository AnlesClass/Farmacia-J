package BusinessObject;

import lombok.Data;

@Data
public class Cliente {

    private int idCliente;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    
    public String[] lista(){
        var lista = new String[5];
        lista[0] = String.valueOf(idCliente);
        lista[1] = String.valueOf(dni);
        lista[2] = nombre;
        lista[3] = apellido;
        lista[4] = String.valueOf(edad);
        return lista;
    }
}
