package DataAccessObject;

import BusinessObject.Producto;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoDAO implements IOperaciones<Producto> {

    @Override
    public boolean insertar(Producto entidad) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO Producto (TipoProducto, Descripcion, Precio, VentaConReceta) values (?, ?, ?, ?)";
            PreparedStatement ps = Conexion.conexionSQL().prepareStatement(sql);
            ps.setString(1, entidad.getTipoProducto());
            ps.setString(2, entidad.getDescripcion());
            ps.setFloat(3, entidad.getPrecio());
            ps.setString(4, entidad.getVentaConReceta());
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR UWU: " + ex.toString());
        }
        return estado;
    }

    @Override
    public boolean modificar(Producto entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Producto> listarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
