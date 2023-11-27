package DataAccessObject;

import Persistencia.Conexion;
import TransferObject.IOperaciones;
import BusinessObject.Boleta;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.Time;
import javax.swing.JOptionPane;

public class BoletaDAO implements IOperaciones<Boleta> {

    @Override
    public boolean insertar(Boleta entidad) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO Boleta(Importe, FechaExpedicion, HoraExpedicion) values (?, ?, ?)";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setFloat(1, entidad.getImporte());
            ps.setDate(2, Date.valueOf(entidad.getFechaExpedicion()));
            ps.setTime(3, Time.valueOf(entidad.getHoraExpedicion()));
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return estado;
    }

    @Override
    public boolean modificar(Boleta entidad) {
        JOptionPane.showMessageDialog(null, "No es modificable. Se devolverá <false>.", "Modificar Boleta", 1);
        return false;
    }

    @Override
    public ArrayList<Boleta> listarTodo() {
        var lista = new ArrayList<Boleta>();
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement("SELECT * FROM Boleta");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(crearEntidad(rs));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar Boletas: " + ex.toString());
        }
        return lista;
    }

    private Boleta crearEntidad(ResultSet rs) {
        Boleta entidad = new Boleta();
        try {
            entidad.setImporte(rs.getFloat(1));
            entidad.setFechaExpedicion(rs.getDate(2).toLocalDate());
            entidad.setHoraExpedicion(rs.getTime(3).toLocalTime());
        } catch (SQLException ex) {
            System.out.println("Error al crear entidad 'Boleta': " + ex.toString());
        }
        return entidad;
    }
}
