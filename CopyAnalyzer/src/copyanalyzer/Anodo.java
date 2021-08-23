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
public class Anodo {
    public Anodo hizquierda;
    public Anodo hderecha;
    public int id;
    public String tipo;
    public String variable;
    public String svalor;
    public int ivalor;

    public Anodo(Anodo hizquierda, Anodo hderecha,String tipo,int id){
        this.hizquierda = hizquierda;
        this.hderecha = hderecha;
        this.tipo=tipo;
    }
    public Anodo(String svalor,String tipo,int id){
        this.svalor=svalor;
        this.tipo=tipo;
        this.id=id;
    }

    public Anodo(Anodo hderecha,Anodo hizquierda,String variable,String svalor,String tipo,int id){
        this.hizquierda = hizquierda;
        this.hderecha = hderecha;
        this.variable=variable;
        this.svalor=svalor;
        this.tipo=tipo;
        this.id=id;
    }
    public Anodo(Anodo hderecha,Anodo hizquierda,String variable,int ivalor,String tipo,int id){
        this.hizquierda = hizquierda;
        this.hderecha = hderecha;
        this.variable=variable;
        this.ivalor=ivalor;
        this.tipo=tipo;
        this.id=id;
    }
    

}

