package DataAccessObject;

import BusinessObject.Cliente;
import TransferObject.IOperaciones;
import java.util.ArrayList;

public class ClienteDAO implements IOperaciones<Cliente>{

    @Override
    public boolean insertar(Cliente entidad) {
        return false;
    }

    @Override
    public boolean modificar(Cliente entidad) {
        return false;
    }

    @Override
    public ArrayList<Cliente> listarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
