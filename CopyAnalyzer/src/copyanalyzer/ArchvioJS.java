
package copyanalyzer;
import java.util.ArrayList;
import java.util.List;

public class ArchvioJS {
     public String NClase;
     List<String> Metodos = new ArrayList<String>();
     List<Integer> cant_parametros = new ArrayList<Integer>();
     public int lineasclass;
     List<String> variables = new ArrayList<String>();
     List<String> Comentarios = new ArrayList<String>();
     List<Integer> lineasmetodo = new ArrayList<Integer>();
     
     public void setmetodos(String metodo, int parametros, int lineas){
        Metodos.add(metodo);
        cant_parametros.add(parametros);
        lineasmetodo.add(lineas);
     }
     public void setclass(String clase,int lineas){
         NClase=clase;
         lineasclass=lineas;
     }
     public void setvariable(String variable){
         variables.add(variable);
     }
      public void setcomentario(String comen){
            Comentarios.add(comen);
     }
}


