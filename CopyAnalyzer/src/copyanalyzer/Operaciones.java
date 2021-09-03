package copyanalyzer;

/**
 *
 * @author angge
 */
public class Operaciones {
    private Nodo inicio;
    public void Operaciones(){
        inicio=null;
    }
    
    public void insertar(String tipo,String id,String valor){
        Nodo nuevo=new Nodo();
        nuevo.setdatos(tipo, id, valor);
        if (inicio==null)
            inicio=nuevo;
        else{
            Nodo aux=inicio;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);   
        }
    }
    public String recorrer_buscar(String id){
        if(inicio!=null){
            Nodo aux=inicio;
            if(aux.getid().equalsIgnoreCase(id)){
                return aux.getvalor();
            }
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
                if(aux.getid().equalsIgnoreCase(id)){
                    return aux.getvalor();
                }
            }
        }
        return "";
    }
    public void recorrer(){
        if(inicio!=null){
            Nodo aux=inicio;
            int cont=0;
            System.out.println("No:"+cont+++" Tipo:"+aux.gettipo()+" ID:"+aux.getid()+" Valor:"+aux.getvalor());
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
                System.out.println("No:"+cont+++" Tipo:"+aux.gettipo()+" ID:"+aux.getid()+" Valor:"+aux.getvalor());
            }
        }
    }
}
