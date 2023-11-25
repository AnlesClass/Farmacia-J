package DataAccessObject;

import BusinessObject.Producto;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoDAO implements IOperaciones<Producto> {
    
    @Override
    public boolean insertar(Producto entidad) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO Producto(TipoProducto, Descripcion, Precio, VentaConReceta) values (?, ?, ?, ?)";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1, entidad.getTipoProducto());
            ps.setString(2, entidad.getDescripcion());
            ps.setFloat(3, entidad.getPrecio());
            ps.setBoolean(4, entidad.isVentaConReceta());
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return estado;
    }

    @Override
    public boolean modificar(Producto entidad) {
        boolean estado = false;
        try {
            //Tabla producto: TipoProducto, Descripcion, Precio, VentaConReceta
            String sql = "UPDATE Producto SET TipoProducto = ?, Descripcion = ?, Precio = ?, VentaConRecta = ?"
                    + " WHERE idProducto = ?";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1, entidad.getTipoProducto());
            ps.setString(2, entidad.getDescripcion());
            ps.setFloat(3, entidad.getPrecio());
            ps.setBoolean(4, entidad.isVentaConReceta());
            estado = ps.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return estado;
    }

    @Override
    public ArrayList listarTodo() {
        var lista = new ArrayList<Producto>();
        try {
            String sql = "SELECT * FROM Producto";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //lista.add();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public String[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
