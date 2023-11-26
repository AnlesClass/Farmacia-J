package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://containers-us-west-176.railway.app:5583/railway";
    private static final String USUARIO = "root";
    private static final String CONTRA = "bJoRTX3rt5BjtFdPHdTX";

    public static Connection conexionMySQL() {
        try {
            connection = DriverManager.getConnection(URL, USUARIO, CONTRA);
            System.out.println("EXITO AL CONECTAR CON BASE DE DATOS");
        } catch (SQLException ex) {
            System.out.println("ERROR AL CONECTAR CON BASE DE DATOS");
        }
        return connection;
    }
}
