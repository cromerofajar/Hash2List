package excdhashmap;


import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class MostrarClassList {
    /*
    * mostrar Nos permite visualizar un ArrayList de objetos ClassList mediante un JOptionPane
    */
    public static void mostrar(ClassList lista){
//        for(int i=0;i<lista.lista.size();i++){
//            JOptionPane.showMessageDialog(null, i+" "+lista.lista.get(i));
//        }
//        System.out.println("Index value");
//        for(int i=0;i<lista.lista.size();i++){
//            System.out.println(i+"     "+lista.lista.get(i));
//        }
        String mostrar="index  values";
        for(int i=0;i<lista.lista.size();i++){
            /*
            * Mediante esto nos permite añadir a la variable mostrar los elementos del ArrayList
            */
            mostrar=mostrar+"\n"+i+"         "+lista.lista.get(i); 
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
}
