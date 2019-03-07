package excdhashmap;

import java.util.ArrayList;
import utilidades.PedirDatos;

/**
 *
 * @author cromerofajar
 */
public class ClassList implements InterfaceList{
    public ArrayList<String>lista=new ArrayList<>();
    /*
    * putElement nos introduce en el ArrayList un elemento en la ultima posicion.
    */
    @Override
    public void putElement() {
        lista.add(PedirDatos.texto("Introduce el elemento a añadir"));
    }
    /*
    * getElement retorna un String de la posicion del ArrayList que nosotros le introduzcamos mediante PedirDatos.    
    */
    @Override
    public String getElement() {
        return lista.get(PedirDatos.entero("Introduce posicion del elemento deseado"));
    }
    
}
