package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Una clase conexión, ubicada en el paquete persistencia, por lo general posee
varios atributos y métodos distintivos del resto de clases, como la conexión
como tal, la url de la base de datos, el usuario de dicha base y el objeto de
tipo sentencia que envía los querys y demás cosas a la BD.*/
public class Conexion {

    private static Connection connection;
    private static String url;
    private static String usuario;
    private static String contra;

    public Conexion() {
        connection = null;
        url = "jdbc:mysql://containers-us-west-176.railway.app:5583/railway";
        usuario = "root";
        contra = "bJoRTX3rt5BjtFdPHdTX";
    }

    public static Connection conexionMySQL() {
        try {
            connection = DriverManager.getConnection(url, usuario, contra);
            System.out.println("EXITO AL CONECTAR CON BASE DE DATOS");
        } catch (SQLException ex) {
            System.out.println("ERROR AL CONECTAR CON BASE DE DATOS");
        }
        return connection;
    }
}
