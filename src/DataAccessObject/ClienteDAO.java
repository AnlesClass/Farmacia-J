package DataAccessObject;

import BusinessObject.Cliente;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    private Cliente crearEntidad(ResultSet rs) {
        Cliente cliente = new Cliente();
        try {
            cliente.setDni(rs.getInt(1));
            cliente.setNombre(rs.getString(2));
            cliente.setApellido(rs.getString(3));
            cliente.setEdad(rs.getInt(4));
        } catch (SQLException ex) {
            System.out.println("Error al crear entidad 'Cliente': " + ex.toString());
        }
        return cliente;
    }

    @Override
    public ArrayList<Cliente> buscar(String busca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
