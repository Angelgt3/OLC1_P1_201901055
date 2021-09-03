
package copyanalyzer;
import copyanalyzer.*;
/**
 *
 * @author angge
 */
public class NodoA {
    public NodoA hizq;
    public NodoA hder;
    
    public String datos[];
    public String Primeros;
    public String Ultimos;
    public String anulable;
    
    public NodoA(NodoA hizq, NodoA hder, String[] datos) {
        this.hizq = hizq;
        this.hder = hder;
        this.datos = datos;
    }
    public NodoA getHizq(){
        return hizq;
    }
    public void setHizq(NodoA hizq) {
        this.hizq = hizq;
    }
    public NodoA getHder() {
        return hder;
    }
    public void setHder(NodoA hder) {
        this.hder = hder;
    }
    public String[] getdatos() {
        return datos;
    }
    public void setValor(String[] valor) {
        this.datos = valor;
    }
    
   
}
