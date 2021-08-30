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
    
    public void insertar(double punteo,String tipo,String id){
        Npes nuevo=new Npes();
        nuevo.setpunteo(punteo, tipo, id);
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

    
}
