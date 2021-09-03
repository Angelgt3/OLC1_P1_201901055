package copyanalyzer;

/**
 *
 * @author angge
 */
public class Nodo {
    private Nodo siguiente;
    private String tipo;
    private String id;
    private String valor;
    
    
    public void Nodo(){
        this.siguiente=null;
    }
    public void setdatos(String tipo,String id,String valor){
        this.tipo=tipo;
        this.id=id;
        this.valor=valor;
    }
    public String gettipo(){
        return tipo;
    }
    public String getid(){
        return id;
    }
    public String getvalor(){
        return valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    } 
    
}
