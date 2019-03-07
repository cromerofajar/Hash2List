package excdhashmap;

import java.util.HashMap;
import utilidades.PedirDatos;

/**
 *
 * @author cromerofajar
 */
public class ClassHash implements InterfaceHash{
    public HashMap<Integer,String> texto=new HashMap<Integer,String>();
    /*
    * putValue Nos introduce en el HashMap los datos que le introduzcamos con la clave que le introduzcamos en caso de repetidos lo sobreescribe.
    */
    @Override
    public void putValue() {
        texto.put(PedirDatos.entero("Introduce la clave del nuevo elemento"), PedirDatos.texto("Introduce el texto del elemento"));
        
    }
    /*
    * getValue nos retorna el valor que tenga la clave que nosotros introduzcamos
    */
    @Override
    public String getValue() {
        return texto.get(PedirDatos.entero("Introduce la clave a buscar"));
    }
    
}
