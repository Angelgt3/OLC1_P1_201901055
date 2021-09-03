/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyanalyzer;

/**
 *
 * @author angge
 */
public class Pespecificos {
    
    private Npes inicio;
    
    public void Pespecificos(){
        inicio=null;
    }
    
    public void insertar(double punteo,String tipo,String id,String archivo){
        Npes nuevo=new Npes();
        nuevo.setpunteo(punteo, tipo, id,archivo);
        if (inicio==null)
            inicio=nuevo;
        else{
            Npes aux=inicio;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);   
        }
    }
    
    public void recorrer(){
        if(inicio!=null){
            Npes aux=inicio;
            int cont=0;
            System.out.println("No:"+cont+++" Archivo:"+aux.getarchivo()+" Tipo:"+aux.gettipo()+" ID:"+aux.getid()+" Punteo:"+aux.getpunteo());
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
                System.out.println("No:"+cont+" Archivo:"+aux.getarchivo()+" Tipo:"+aux.gettipo()+" ID:"+aux.getid()+" Punteo:"+aux.getpunteo());
                cont++;
            }
        }
    }
    
   
    
    public double buscar(String archivo,String tipo,String id){
      
        if(inicio!=null){
            Npes aux=inicio;
            if(aux.getarchivo().equalsIgnoreCase(archivo) && aux.gettipo().equalsIgnoreCase(tipo) && aux.getid().equalsIgnoreCase(id)){
                return aux.getpunteo();
                //System.out.println("Archivo:"+aux.getarchivo()+" Tipo:"+aux.gettipo()+" ID:"+aux.getid()+" Punteo:"+aux.getpunteo());
            }
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
                if(aux.getarchivo().equalsIgnoreCase(archivo) && aux.gettipo().equalsIgnoreCase(tipo) && aux.getid().equalsIgnoreCase(id)){
                    return aux.getpunteo();     
                //System.out.println("Archivo:"+aux.getarchivo()+" Tipo:"+aux.gettipo()+" ID:"+aux.getid()+" Punteo:"+aux.getpunteo());
                }
            }
           
            
        }
        return 0;
        
    }
    
}
