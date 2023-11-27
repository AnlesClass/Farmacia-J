package DataAccessObject;

import BusinessObject.Factura;
import Persistencia.Conexion;
import TransferObject.IOperaciones;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FacturaDAO implements IOperaciones<Factura> {

    @Override
    public boolean insertar(Factura entidad) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO Factura(NombreCliente, RUC, Importe, Telefono, FechaExpedicion, HoraExpedicion) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1, entidad.getNombreCliente());
            ps.setInt(2, entidad.getRuc());
            ps.setFloat(3, entidad.getImporte());
            ps.setInt(4, entidad.getTelefono());
            ps.setDate(5, Date.valueOf(entidad.getFechaExpedicion()));
            ps.setTime(6, Time.valueOf(entidad.getHoraExpedicion()));
            estado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return estado;
    }

    @Override
    public boolean modificar(Factura entidad) {
        JOptionPane.showMessageDialog(null, "No es modificable. Se devolverá <false>.", "Modificar Factura", 1);
        return false;
    }

    @Override
    public ArrayList<Factura> listarTodo() {
        var lista = new ArrayList<Factura>();
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement("SELECT * FROM Factura");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(crearEntidad(rs));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar Facturas: " + ex.toString());
        }
        return lista;
    }
//nombreCliente - ruc - importe - telefono - fechaExpedicion - horaExpedicion

    private Factura crearEntidad(ResultSet rs) {
        Factura entidad = new Factura();
        try {
            entidad.setNombreCliente(rs.getString(1));
            entidad.setRuc(rs.getInt(2));
            entidad.setImporte(rs.getFloat(3));
            entidad.setTelefono(rs.getInt(4));
            entidad.setFechaExpedicion(rs.getDate(5).toLocalDate());
            entidad.setHoraExpedicion(rs.getTime(6).toLocalTime());
        } catch (SQLException ex) {
            System.out.println("Error al crear entidad 'Factura': " + ex.toString());
        }
        return entidad;
    }
}
