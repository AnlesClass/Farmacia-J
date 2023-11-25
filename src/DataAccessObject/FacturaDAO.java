package DataAccessObject;

import BusinessObject.Factura;
import TransferObject.IOperaciones;
import java.util.ArrayList;

public class FacturaDAO implements IOperaciones<Factura>{

    @Override
    public boolean insertar(Factura entidad) {
        return false;
    }

    @Override
    public boolean modificar(Factura entidad) {
        return false;
    }

    @Override
    public ArrayList<Factura> listarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
