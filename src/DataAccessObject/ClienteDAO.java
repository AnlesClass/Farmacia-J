package DataAccessObject;

import BusinessObject.Cliente;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO implements IOperaciones<Cliente> {

    @Override
    public boolean insertar(Cliente entidad) {
        boolean estado = false;
        String sql = "INSERT INTO Cliente(DNI, Nombre, Apellido, Edad) values (?, ?, ?, ?)";
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, entidad.getDni());
            ps.setString(2, entidad.getNombre());
            ps.setString(3, entidad.getApellido());
            ps.setInt(4, entidad.getEdad());
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return estado;
    }

    @Override
    public boolean modificar(Cliente entidad) {
        boolean estado = false;
        try {
            String sql = "UPDATE Cliente SET DNI = ?, Nombre = ?, Apellido = ?, Edad = ? WHERE idCliente = ?";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, entidad.getDni());
            ps.setString(2, entidad.getNombre());
            ps.setString(3, entidad.getApellido());
            ps.setInt(4, entidad.getEdad());
            ps.setInt(5, entidad.getIdCliente());
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return estado;
    }

    @Override
    public ArrayList<Cliente> listarTodo() {
        var lista = new ArrayList<Cliente>();
        String sql = "SELECT * FROM Cliente";
        PreparedStatement ps;
        try {
            ps = Conexion.conexionMySQL().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                lista.add(crearEntidad(rs));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return lista;
    }

    public ResultSet buscarPorDNI(String DNI) {
        ResultSet rs = null;
        String sql = "SELECT C.Nombre, CT.Telefono FROM Cliente C INNER JOIN ClienteTelefono"
                + " CT ON C.IdCliente = CT.IdCliente WHERE C.DNI = ?;";
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1, DNI);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al 'buscarPorDNI': " + ex.toString());
        }
        return rs;
    }

    private Cliente crearEntidad(ResultSet rs) {
        Cliente cliente = new Cliente();
        try {
            cliente.setIdCliente(rs.getInt(1));
            cliente.setDni(rs.getInt(2));
            cliente.setNombre(rs.getString(3));
            cliente.setApellido(rs.getString(4));
            cliente.setEdad(rs.getInt(5));
        } catch (SQLException ex) {
            System.out.println("Error al crear entidad 'Cliente': " + ex.toString());
        }
        return cliente;
    }

    public Cliente getClientePorDNI(String dni) {
        Cliente cl = new Cliente();
        String sql = "SELECT C.IdCliente, C.DNI, C.Nombre, C.Apellido, C.Edad FROM Cliente C WHERE DNI = ?;";
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cl.setIdCliente(rs.getInt(1));
                cl.setDni(rs.getInt(2));
                cl.setNombre(rs.getString(3));
                cl.setApellido(rs.getString(4));
                cl.setEdad(rs.getInt(5));
            }
            return cl;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
            return cl;
        }
    }

    public int ultimoID() {
        try {
            String sql = "SELECT MAX(idCliente) FROM Cliente";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar ultimo id: " + ex.toString());
        }
        return -1; //retorna -1 si hay algun error
    }
}
