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
    private Npes siguiente;
    
    public void Npes(){
        this.siguiente=null;
    }
    public double getpunteo(){
        return Punteo;
    }
    public void setpunteo(double punteo,String tipo,String id){
        this.Punteo=punteo;
        this.tipo=tipo;
        this.id=id;
    }
    public Npes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Npes siguiente) {
        this.siguiente = siguiente;
    } 
}
