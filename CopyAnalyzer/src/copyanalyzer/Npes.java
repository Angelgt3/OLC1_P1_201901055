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
public class Npes {
    
    private double Punteo;
    private String tipo;
    private String id;
    private String archivo;
    private Npes siguiente;
    
    public void Npes(){
        this.siguiente=null;
    }
    public String gettipo(){
        return tipo;
    }
    public String getarchivo(){
        return archivo;
    }
    public String getid(){
        return id;
    }
    public double getpunteo(){
        return Punteo;
    }
    public void setpunteo(double punteo,String tipo,String id,String archivo){
        this.Punteo=punteo;
        this.tipo=tipo;
        this.id=id;
        this.archivo=archivo;
    }
    public Npes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Npes siguiente) {
        this.siguiente = siguiente;
    } 
}
