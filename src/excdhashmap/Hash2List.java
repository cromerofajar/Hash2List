package excdhashmap;

import java.util.Iterator;

/**
 *
 * @author cromerofajar
 */
public class Hash2List extends ClassList{
    /*
    * Hash2List nos permite introducir datos en nuestro ArrayList
    */
    public Hash2List(ClassHash hashAConvertir){
        Iterator it= hashAConvertir.texto.keySet().iterator();
        while(it.hasNext()){
            lista.add(hashAConvertir.texto.get(it.next()));
        }
    }
}
