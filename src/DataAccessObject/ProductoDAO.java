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
            String sql = "INSERT INTO Producto(IdTipoProducto, Nombre, Descripcion, VentaConReceta, Precio) values (?, ?, ?, ?, ?)";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, entidad.getIdTipoProducto());
            ps.setString(2, entidad.getNombre());
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
            String sql = "UPDATE Producto SET  IdTipoProducto = ?,Nombre = ?, Descripcion = ?, VentaConReceta = ?, Precio = ?"
                    + " WHERE idProducto = ?";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, entidad.getIdTipoProducto());
            ps.setString(2, entidad.getNombre());
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

    private Producto crearEntidad(ResultSet rs) {
        Producto entidad = new Producto();
        try {
            entidad.setIdProducto(rs.getInt(1));
            entidad.setIdTipoProducto(rs.getInt(2));
            entidad.setNombre(rs.getString(3));
            entidad.setDescripcion(rs.getString(4));
            entidad.setVentaConReceta(rs.getBoolean(5));
            entidad.setPrecio(rs.getFloat(6));
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return entidad;
    }
    //METODO BUSCAR POR NOMBRE Y DESCRIPCION (ID, nombre,Descripcion, Tipo, Receta, Precio);
    public ResultSet BuscarProducto(String nombre, String descripcion){
        ResultSet rs = null;
        try {
            String sql  = "SELECT P.IdProducto, P.Nombre, P.Descripcion, TP.Nombre, P.Precio, P.VentaConReceta FROM "
                    + "Producto P JOIN TipoProducto TP ON TP.IdTipoProducto = P.IdTipoProducto WHERE P.Nombre LIKE ?"
                    + "AND P.Descripcion LIKE ?";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1,  nombre +  "%");
            ps.setString(2, descripcion + "%");
            rs= ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println("ERROR: "  + ex.toString()); 
        }
        return rs;
    }
}
