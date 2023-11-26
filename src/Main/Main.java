package Main;

import BusinessObject.Producto;
import DataAccessObject.ProductoDAO;

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
