package DataAccessObject;

import BusinessObject.Pedido;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PedidoDAO implements IOperaciones<Pedido> {

    @Override
    public boolean insertar(Pedido entidad) {
        boolean estado = false;
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement("INSERT INTO Pedido(IdCliente, FechaPedido) values (?, ?)");
            ps.setInt(1, entidad.getIdCliente());
            ps.setDate(2, Date.valueOf(entidad.getFechaPedido()));       
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return estado;
    }

    @Override
    public boolean modificar(Pedido entidad) {
        JOptionPane.showMessageDialog(null, "No es modificable. Se devolverá <false>.", "Modificar Pedido", 1);
        return false;
    }

    @Override
    public ArrayList<Pedido> listarTodo() {
        var lista = new ArrayList<Pedido>();
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement("SELECT * FROM Pedido");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(crearEntidad(rs));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar Pedidos: " + ex.toString());
        }
        return lista;
    }

    private Pedido crearEntidad(ResultSet rs) {
        Pedido entidad = new Pedido();
        try {
            entidad.setFechaPedido(rs.getDate(1).toLocalDate());
        } catch (SQLException ex) {
            System.out.println("Error al crear entidad 'Pedido': " + ex.toString());
        }
        return entidad;
    }
}
