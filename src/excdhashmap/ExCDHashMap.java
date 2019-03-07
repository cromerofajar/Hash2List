package excdhashmap;


/**
 *
 * @author cromerofajar
 */
public class ExCDHashMap {

    public static void main(String[] args) {
//        ClassHash miHash=new ClassHash();
//        ClassList miList=new ClassList();
//        for(int i=0;i<4;i++){
//            miHash.putValue();
//            //miList.putElement();
//        }
//        MostrarClassList.mostrar(miList);
        ClassHash miHash=new ClassHash();
        for(int i=0;i<3;i++){
            miHash.putValue();
        }
        Hash2List miHash2List=new Hash2List(miHash);
        MostrarClassList.mostrar(miHash2List);
    }
    
}
