package DataAccessObject;

import Persistencia.Conexion;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetallePedidoDAO {

    public ResultSet buscarPorIdCliente(int IdCliente) {
        ResultSet r = null;
        try {
            String sql = "SELECT P.IdProducto, P.Nombre, DP.Cantidad, DP.PrecioUnitario, DP.PrecioUnitario"
                    + " * DP.Cantidad FROM Producto P JOIN DetallePedido DP ON DP.IdProducto = P.IdProducto "
                    + "WHERE DP.IdPedido = ?";

            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setInt(1, IdCliente);
            r = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return r;
    }
}
