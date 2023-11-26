package DataAccessObject;

import BusinessObject.Producto;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ProductoDAO implements IOperaciones<Producto> {

    @Override
    public boolean insertar(Producto entidad) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO Producto(Nombre,TipoProducto,Descripcion,VentaConReceta,Precio) values (?, ?, ?, ?, ?)";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getTipoProducto());
            ps.setString(3, entidad.getDescripcion());
            ps.setBoolean(4, entidad.isVentaConReceta());
            ps.setFloat(5, entidad.getPrecio());
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
            String sql = "UPDATE Producto SET Nombre = ?,TipoProducto = ?, Descripcion = ?, VentaConReceta = ?, Precio = ?"
                    + " WHERE idProducto = ?";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getTipoProducto());
            ps.setString(3, entidad.getDescripcion());
            ps.setBoolean(4, entidad.isVentaConReceta());
            ps.setFloat(5, entidad.getPrecio());
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
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
                lista.add(crearEntidad(rs));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return lista;
    }

    private Producto crearEntidad(ResultSet r) {
        Producto entidad = new Producto();
        try {
            entidad.setIdProducto(r.getInt(1));
            entidad.setNombre(r.getString(2));
            entidad.setTipoProducto(r.getString(3));
            entidad.setDescripcion(r.getString(4));
            entidad.setVentaConReceta(r.getBoolean(5));
            entidad.setPrecio(r.getFloat(6));
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return entidad;
    }

    @Override
    public ArrayList<Producto> buscar(String busca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
