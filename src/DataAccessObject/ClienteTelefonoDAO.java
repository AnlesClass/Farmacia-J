package DataAccessObject;

import BusinessObject.Cliente;
import BusinessObject.ClienteTelefono;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteTelefonoDAO implements IOperaciones<ClienteTelefono> {

    @Override
    public boolean insertar(ClienteTelefono entidad) {
        boolean estado = false;
        String sql = "INSERT INTO ClienteTelefono (Telefono) values (?)";
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, entidad.getTelefono());
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return estado;
    }

    @Override
    public boolean modificar(ClienteTelefono entidad) {
        boolean estado = false;
        /*try {
            String sql = "UPDATE ClienteTelefono Telefono WHERE idCliente = ?";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, entidad.getDni());
            ps.setString(2, entidad.getNombre());
            ps.setString(3, entidad.getApellido());
            ps.setInt(4, entidad.getEdad());
            ps.setInt(5, entidad.getIdCliente());
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }*/
        return estado;
    }

    @Override
    public ArrayList<ClienteTelefono> listarTodo() {
        return null;
    }
    
    public ArrayList<ClienteTelefono> buscarId(int busca) {
        var lista = new ArrayList<ClienteTelefono>();
        try {
            String sql = "SELECT * FROM ClienteTelefono WHERE idCliente = ?";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, busca);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                lista.add(crearEntidad(rs));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR BUSCAR: " + ex.toString());
        }
        return lista;
    }
    
    private ClienteTelefono crearEntidad(ResultSet rs){
        ClienteTelefono entidad = new ClienteTelefono();
        try {
            entidad.setIdClienteTelefono(rs.getInt(1));
            entidad.setTelefono(rs.getInt(3));
        } catch (SQLException ex) {
            System.out.println("ERROR: "+ex.toString());
        }
        return entidad;
    };
     public boolean insertar(int idCliente,ClienteTelefono entidad) {
        boolean estado = false;
        String sql = "INSERT INTO ClienteTelefono (IdCliente,Telefono) values (?,?)";
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.setInt(2, entidad.getTelefono());
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return estado;
    }
}
