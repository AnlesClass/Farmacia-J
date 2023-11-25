package Main;

import BusinessObject.Boleta;
import BusinessObject.Producto;
import DataAccessObject.ProductoDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.Date;
import java.sql.Time;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        
        Producto pd = new Producto();
        pd.setTipoProducto("UWU");
        pd.setDescripcion("Agigantador de penes");
        pd.setPrecio(25.5f);
        pd.setVentaConReceta(true);
        ProductoDAO pdDao = new ProductoDAO();
        pdDao.insertar(pd);
    }
}
