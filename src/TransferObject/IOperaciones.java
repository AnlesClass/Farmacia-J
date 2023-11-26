package TransferObject;

import java.util.ArrayList;

public interface IOperaciones<T> {
    public boolean insertar(T entidad);
    public boolean modificar(T entidad);
    public ArrayList<T> listarTodo();
    public ArrayList<T> buscarId(int busca);
}
