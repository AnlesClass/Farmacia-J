package DataAccessObject;

import BusinessObject.Pedido;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

public class PedidoDAO implements IOperaciones<Pedido> {

    @Override
    public boolean insertar(Pedido entidad) {
        boolean estado = false;
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement("INSERT INTO Pedido(FechaPedido) values (?)");
            ps.setDate(1,  Date.valueOf(entidad.getFechaPedido()));
            estado = ps.executeUpdate()>0;
        } catch (SQLException ex) {
            System.out.println("ERROR: "+ex.toString());
        }
        return estado;
    }

    @Override
    public boolean modificar(Pedido entidad) {
        boolean estado = false;
        
        return estado;
    }

    @Override
    public ArrayList<Pedido> listarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
