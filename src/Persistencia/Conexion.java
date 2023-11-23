package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Una clase conexión, ubicada en el paquete persistencia, por lo general posee
varios atributos y métodos distintivos del resto de clases, como la conexión
como tal, la url de la base de datos, el usuario de dicha base y el objeto de
tipo sentencia que envía los querys y demás cosas a la BD.*/
public class Conexion {

    private static Connection connection = null;
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=dbLRPD;integratedSecurity=false;encrypt=false;trustServerCertificate=false";
    private static final String usuario = "sa";
    private static final String contra = "12345";

    public static Connection conexionSQL() {
        try {
            connection = DriverManager.getConnection(url, usuario, contra);
            System.out.println("EXITO AL CONECTAR CON BASE DE DATOS");
        } catch (SQLException ex) {
            System.out.println("ERROR AL CONECTAR CON BASE DE DATOS");
        }
        return connection;
    }
}
