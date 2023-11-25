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

public class BoletaDAO implements IOperaciones<Boleta> {

    @Override
    public boolean insertar(Boleta entidad) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO Boleta(Importe, FechaExpedicion, HoraExpedicion) values (?, ?, ?)";
            PreparedStatement ps = Conexion.conexionSQL().prepareStatement(sql);
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
        System.out.println("Método no disponible para BoletaDAO");
        return false;
    }

    @Override
    public ArrayList<Boleta> listarTodo() {
        var lista = new ArrayList<Boleta>();
        try {
            PreparedStatement ps = Conexion.conexionSQL().prepareStatement("SELECT * FROM Boleta");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(boletaTemp(rs));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar Boletas: " + ex.toString());
        }
        return lista;
    }

    private Boleta boletaTemp(ResultSet rs) {
        Boleta blt = new Boleta();
        try {
            blt.setImporte(rs.getFloat(1));
            blt.setFechaExpedicion(rs.getDate(2).toLocalDate());
            blt.setHoraExpedicion(rs.getTime(3).toLocalTime());
        } catch (SQLException ex) {
            System.out.println("Error al crear 'boletaTemp': " + ex.toString());
        }
        return blt;
    }

    //Presumo que este método sirve para agarrar un resultset y pasar sus campos a String[].
    //Lo que contiene lo he hecho yo mismo.
    @Override
    public String[] toArray() {
        return null;
    }

}
