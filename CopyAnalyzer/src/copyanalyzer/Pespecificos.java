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
    
    public String recorrer_buscar(){
        String texto="";
        if(inicio!=null){
            Npes aux=inicio;
            do{
                aux=aux.getSiguiente();
                String temp2=aux.getid().replaceAll("\\s","");
                texto+="\t\t{\n"
                    + "\t\t\t\"archivo\": \""+aux.getarchivo()+"\",\n"
                    + "\t\t\t\"tipo\": \""+aux.gettipo()+"\",\n"
                    + "\t\t\t\"nombre\": \""+temp2+"\",\n"
                    + "\t\t\t\"puntaje\": \""+aux.getpunteo()+"\"\n"
                    + "\t\t},\n";
            }
            while(aux.getSiguiente()!=null);
            String temp=aux.getid().replaceAll("\\s","");
            texto+="\t\t{\n"
                    + "\t\t\t\"archivo\": \""+aux.getarchivo()+"\",\n"
                    + "\t\t\t\"tipo\": \""+aux.gettipo()+"\",\n"
                    + "\t\t\t\"nombre\": \""+temp+"\",\n"
                    + "\t\t\t\"puntaje\": \""+aux.getpunteo()+"\"\n"
                    + "\t\t}\n";
        }
        texto+="\t]\n";
        return texto;
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
