package BusinessObject;

import lombok.Data;

@Data
public class ClienteTelefono {

    private int idClienteTelefono;
    private int telefono;

    public String[] lista() {
        var lista = new String[2];
        lista[0] = String.valueOf(idClienteTelefono);
        lista[1] = String.valueOf(telefono);
        return lista;
    }
}
