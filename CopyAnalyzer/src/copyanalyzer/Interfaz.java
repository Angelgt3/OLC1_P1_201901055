package copyanalyzer;
import Analizadores.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.*;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pestaña 1", jPanel1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Consola");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Editor");

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar como");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Crear Pestaña");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Eliminar Pestaña");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ejecutar");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Reporte");

        jMenuItem4.setText("Errores");
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Estadístico");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Tokens");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("JSON");
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.out.println("*Se crea pestaña*");

    }//GEN-LAST:event_jMenu2MouseClicked
    public copyanalyzer.ArchvioJS Archivo1;
    public copyanalyzer.ArchvioJS Archivo2;
    public Pespecificos pelista=new Pespecificos();
    public Operaciones ope=new Operaciones();
    public double pugeneral=0;
    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
                                         
            System.out.println("*Se Ejecuta*");
            String text1,text2;
            String texto=jTextArea2.getText();
            Archivo1=new  copyanalyzer.ArchvioJS();
            Archivo2=new  copyanalyzer.ArchvioJS();
            Analizadores.A1.parserA1 sintacticoA1;
            sintacticoA1 = new Analizadores.A1.parserA1(new Analizadores.A1.LexicoA1(new StringReader(texto)));
            
            try{
                sintacticoA1.parse();
            }
            catch(Exception e){
                System.out.println("Error al analizar el archivo de entrada ");
                System.out.println("Debido a: "+e.getCause());
            }
            try{
                text1=Analizadores.A1.parserA1.rutas[0];
                text2=Analizadores.A1.parserA1.rutas[1];
                text1=text1.replace("\"", "");
                text2=text2.replace("\"", "");
                //jTextArea1.setText("Ruta 1: "+Analizadores.A1.parserA1.rutas[0]+"\nRuta 2: "+Analizadores.A1.parserA1.rutas[1]);
                String textoA1=leerfichero(text1);
                String textoA2=leerfichero(text2);

                Analizadores.A2.parserA2 sintacticoA2A;
                sintacticoA2A = new Analizadores.A2.parserA2(new Analizadores.A2.LexicoA2(new StringReader(textoA1)));
                try{
                sintacticoA2A.parse();

                LlenarArchivo(Archivo1);

                //jTextArea1.setText(jTextArea1.getText()+"\n Clase: "+Analizadores.A2.parserA2.idclase+" Lineas:"+Analizadores.A2.parserA2.lineasclase); 
                //jTextArea1.setText(jTextArea1.getText()+"\n Clase: "+Archivo1.NClase+" Lineas: "+Archivo1.lineasclass);
                //jTextArea1.setText(jTextArea1.getText()+"\n Metodo: "+Archivo1.Metodos+" parametros: "+Archivo1.cant_parametros+" Lineas: "+Archivo1.lineasmetodo);
                //jTextArea1.setText(jTextArea1.getText()+"\n Variables: "+Archivo1.variables); 
                //jTextArea1.setText(jTextArea1.getText()+"\n Comentarios: "+Archivo1.Comentarios);

                }
                catch(Exception e){
                System.out.println("Error al analizar la entrada");
                System.out.println("Debido a: "+e.getCause());
                }

                Analizadores.A2.parserA2 sintacticoA2B;
                sintacticoA2B = new Analizadores.A2.parserA2(new Analizadores.A2.LexicoA2(new StringReader(textoA2)));
                try{  
                sintacticoA2B.parse();
                LlenarArchivo(Archivo2); 

                for(int i=0;i<Archivo1.Metodos.size();i++){
                    Archivo2.Metodos.remove(0);
                    Archivo2.cant_parametros.remove(0);
                    Archivo2.lineasmetodo.remove(0);
                }            
                for(int i=0;i<Archivo1.variables.size();i++){
                    Archivo2.variables.remove(0);
                }
                for(int i=0;i<Archivo1.Comentarios.size();i++){
                    Archivo2.Comentarios.remove(0);
                }


                //jTextArea1.setText(jTextArea1.getText()+"\n Clase: "+Analizadores.A2.parserA2.idclase+" Lineas:"+Analizadores.A2.parserA2.lineasclase); 
                //jTextArea1.setText(jTextArea1.getText()+"\n Clase: "+Archivo2.NClase+" Lineas: "+Archivo2.lineasclass); 
                //jTextArea1.setText(jTextArea1.getText()+"\n Metodo: "+Archivo2.Metodos+" parametros: "+Archivo2.cant_parametros+" Lineas: "+Archivo2.lineasmetodo);
                //jTextArea1.setText(jTextArea1.getText()+"\n Variables: "+Archivo2.variables); 
                //jTextArea1.setText(jTextArea1.getText()+"\n Comentarios: "+Archivo2.Comentarios);

                }
                catch(Exception e){
                System.out.println("Error al analizar la entrada");
                System.out.println("Debido a: "+e.getCause());
                }
                pugeneral=pgeneral(Archivo1,Archivo2);
                //jTextArea1.setText(jTextArea1.getText()+"\nPuntuaje general: "+pgeneral(Archivo1,Archivo2));
                //jTextArea1.setText(jTextArea1.getText()+"\nPuntuaje Especifico: ");
                pespefico(Archivo1,Archivo2);
                /*
                pelista.recorrer();
                pelista.buscar("archivo1.js","clase","draws");
                pelista.buscar("archivo1.js","metodo","imprimir");
                pelista.buscar("archivo2.js","variable","draw_square_draw");
                */
                llenar1();
                
                jTextArea1.setText(jTextArea1.getText()+"\nFinalizo el analisis");
            }
            catch(Exception e){
                System.out.println("Error"+e);
            }
            //hacer(Analizadores.A1.parserA1.Raiz);
           
    }//GEN-LAST:event_jMenu4MouseClicked
    public void llenar1(){
        for (int i=0;i<Analizadores.A1.parserA1.id.length;i++){
            if(Analizadores.A1.parserA1.id[i]!=null){
                String tex1=Analizadores.A1.parserA1.tipo[i];
                String text2=Analizadores.A1.parserA1.id[i];
                String text3=Analizadores.A1.parserA1.valor[i];
                String t1=tex1.replace("\"", "");
                String t2=text2.replace("\"", "");
                String t3=text3.replace("\"", "");
                ope.insertar(t1,t2,t3);
            }
            else{break;}
        }
        
        for(int i=0;i<Analizadores.A1.parserA1.bid2.length;i++){
            if(Analizadores.A1.parserA1.bid2[i]!=null){
                String text1=Analizadores.A1.parserA1.archivo[i];
                String text2=Analizadores.A1.parserA1.tipo2[i];
                String text3=Analizadores.A1.parserA1.bid2[i];
                String t1=text1.replace("\"", "");
                String t2=text2.replace("\"", "");
                String t3=text3.replace("\"", "");
                double a= pelista.buscar(t1,t2 ,t3 );
                ope.insertar(t2, t3,String.valueOf(a));
            }
            else{break;}
        }
        for(int i=0;i<Analizadores.A1.parserA1.larchivo.length;i++){
            if(Analizadores.A1.parserA1.larchivo[i]!=null){
                System.out.println("archivo; "+Analizadores.A1.parserA1.larchivo[i]);
                System.out.println("titulo; "+Analizadores.A1.parserA1.ltitulo[i]);
                String valor=ope.recorrer_buscar(Analizadores.A1.parserA1.larchivo[i]);
                String valor2=ope.recorrer_buscar(Analizadores.A1.parserA1.ltitulo[i]);
                if(valor!="" &&valor2==""){
                    grafica_lineas(valor,Analizadores.A1.parserA1.ltitulo[i]);
                }
                else if(valor=="" &&valor2!=""){
                    grafica_lineas(Analizadores.A1.parserA1.larchivo[i],valor2);
                }
                else{
                    grafica_lineas(Analizadores.A1.parserA1.larchivo[i],Analizadores.A1.parserA1.ltitulo[i]);
                }
            }else{break;}
        }
        
        
        //ope.recorrer();
    }
    
    public void grafica_lineas(String archivo, String titulo){
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        String ta=archivo.replace("\"","");

        if(ta.equalsIgnoreCase("archivo1.js")){
            System.out.println("entro");
            line_chart_dataset.addValue( Archivo1.variables.size() , archivo , "Variables" );
            line_chart_dataset.addValue( Archivo1.Metodos.size() , archivo , "Funciones" );
            line_chart_dataset.addValue( 1 , archivo , "Clases" );
            line_chart_dataset.addValue( Archivo1.Comentarios.size() , archivo , "Comentario" );
        }
        else if(ta.equalsIgnoreCase("archivo2.js")){
            line_chart_dataset.addValue( Archivo2.variables.size() , archivo , "Variables" );
            line_chart_dataset.addValue( Archivo2.Metodos.size() , archivo , "Funciones" );
            line_chart_dataset.addValue( 1 , archivo , "Clases" );
            line_chart_dataset.addValue( Archivo2.Comentarios.size() , archivo , "Comentario" );
        }
        JFreeChart lineChartObject = ChartFactory.createLineChart(
         titulo,"",
         "",
         line_chart_dataset,PlotOrientation.VERTICAL,
         true,true,false);
   
      int width = 640;    /* Width of the image */
      int height = 480;   /* Height of the image */ 
      File lineChart = new File( "graficalineas_"+ta+".jpeg" ); 
        try {
            ChartUtilities.saveChartAsJPEG(lineChart, lineChartObject, width, height);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void hacer(NodoA raiz){
        
        if (raiz.hizq != null) {
            hacer(raiz.hizq);
        }
        if (raiz.hder != null) {
            hacer(raiz.hder);
        }
        if (raiz.hizq == null && raiz.hder == null) {
            System.out.println("hola");
        }
    }
    
    public void LlenarArchivo(copyanalyzer.ArchvioJS Archivo1){
        Archivo1.setclass(Analizadores.A2.parserA2.idclase, Analizadores.A2.parserA2.lineasclase);
            for(int i=0;i<Analizadores.A2.parserA2.idmetodos.length;i++){
                if (Analizadores.A2.parserA2.idmetodos[i] != null) {
                    //jTextArea1.setText(jTextArea1.getText()+"\n Metodo: "+Analizadores.A2.parserA2.idmetodos[i]+" Parametros: "+Analizadores.A2.parserA2.cantparemetro[i]+" Lineas:"+Analizadores.A2.parserA2.lineasmetodo[i]);
                    Archivo1.setmetodos(Analizadores.A2.parserA2.idmetodos[i], Analizadores.A2.parserA2.cantparemetro[i], Analizadores.A2.parserA2.lineasmetodo[i]);
                }
                else{break;}
            }
            for(int i=0;i<Analizadores.A2.parserA2.idvariables.length;i++){
                if (Analizadores.A2.parserA2.idvariables[i] != null) {
                    //jTextArea1.setText(jTextArea1.getText()+"\n Variable: "+Analizadores.A2.parserA2.idvariables[i]);
                    Archivo1.setvariable(Analizadores.A2.parserA2.idvariables[i]);
                }
                else{break;}
            }
            for(int i=0;i<Analizadores.A2.parserA2.vcomentarios.length;i++){
                if (Analizadores.A2.parserA2.vcomentarios[i] != null) {
                    //jTextArea1.setText(jTextArea1.getText()+"\n Comentario: "+Analizadores.A2.parserA2.vcomentarios[i]);
                    Archivo1.setcomentario(Analizadores.A2.parserA2.vcomentarios[i]);
                    
                }
                else{break;}
            }
    }
    
    public static String leerfichero(String texto){
        String textf="";
        try{
                BufferedReader bf1= new BufferedReader(new FileReader(texto));
                String bfread;
                while((bfread=bf1.readLine())!= null){
                    textf=textf+"\n"+bfread;
                }    
            }
            catch(Exception e){
                System.out.println("Error al abrir el fichero no.1  :"+e);
            }
        return textf;
    }
    
    public void pespefico(copyanalyzer.ArchvioJS ar1,copyanalyzer.ArchvioJS ar2){
        
        double valor=0;
        if(ar1.NClase.toString().equalsIgnoreCase(ar2.NClase.toString()))
            valor+=0.2;
        if(ar1.lineasclass==ar2.lineasclass)
            valor+=0.4;
        if(ar1.Metodos.equals(ar2.Metodos))
            valor+=0.4;
        //System.out.println("clase: "+valor);
        pelista.insertar(valor,"clase",ar1.NClase,"archivo1.js");
        pelista.insertar(valor,"clase",ar2.NClase,"archivo2.js");
        valor=0;
         //archivo 1 metodos
        for(int i=0;i<ar1.Metodos.size();i++){
            valor=0;
            for(int j=0;j<ar2.Metodos.size();j++){
                if(ar1.Metodos.get(i).toString().equalsIgnoreCase(ar2.Metodos.get(j).toString())){
                    valor+=0.4;
                    if(ar1.cant_parametros.get(i).toString().equalsIgnoreCase(ar2.cant_parametros.get(j).toString())){
                        valor+=0.3;
                    }
                    if(ar1.lineasmetodo.get(i).toString().equalsIgnoreCase(ar2.lineasmetodo.get(j).toString())){
                        valor+=0.3;
                    }
                    break;
                }
                else if(ar1.Metodos.get(i)!=ar2.Metodos.get(j) && ar1.lineasmetodo.get(i).toString().equalsIgnoreCase(ar2.lineasmetodo.get(j).toString())){
                    valor+=0.3;
                    if(ar1.cant_parametros.get(i).toString().equalsIgnoreCase(ar2.cant_parametros.get(j).toString())){
                        valor+=0.3;
                    }
                    break;
                }
            }
            //System.out.println("Metodo:" +ar1.Metodos.get(i)+" valor:"+valor);
            pelista.insertar(valor,"metodo",ar1.Metodos.get(i),"archivo1.js");
        }
        //archivo 2 metodos
        for(int i=0;i<ar2.Metodos.size();i++){
            valor=0;
            for(int j=0;j<ar1.Metodos.size();j++){
                if(ar2.Metodos.get(i).toString().equalsIgnoreCase(ar1.Metodos.get(j).toString())){
                    valor+=0.4;
                    if(ar2.cant_parametros.get(i).toString().equalsIgnoreCase(ar1.cant_parametros.get(j).toString())){
                        valor+=0.3;
                    }
                    if(ar2.lineasmetodo.get(i).toString().equalsIgnoreCase(ar1.lineasmetodo.get(j).toString())){
                        valor+=0.3;
                    }
                    break;
                }
                else if(ar2.Metodos.get(i)!=ar1.Metodos.get(j) && ar2.lineasmetodo.get(i).toString().equalsIgnoreCase(ar1.lineasmetodo.get(j).toString())){
                    valor+=0.3;
                    if(ar2.cant_parametros.get(i).toString().equalsIgnoreCase(ar1.cant_parametros.get(j).toString())){
                        valor+=0.3;
                    }
                    break;
                }
            }
            //System.out.println("Metodo:" +ar2.Metodos.get(i)+" valor:"+valor);
            pelista.insertar(valor,"metodo",ar2.Metodos.get(i),"archivo2.js");
        }
        //Variable archivo1
        valor=0;
        for(int i=0;i<ar1.variables.size();i++){
            valor=0;
            for(int j=0;j<ar2.variables.size();j++){
                if(ar1.variables.get(i).toString().equalsIgnoreCase(ar2.variables.get(j).toString())){
                    valor+=1;
                    break;
                }
            }
            //System.out.println("Variable :" +ar1.variables.get(i)+" valor:"+valor);
            pelista.insertar(valor,"variable",ar1.variables.get(i),"archivo1.js");
        }
        //Variable archivo2
        for(int i=0;i<ar2.variables.size();i++){
            valor=0;
            for(int j=0;j<ar1.variables.size();j++){
                if(ar2.variables.get(i).toString().equalsIgnoreCase(ar1.variables.get(j).toString())){
                    valor+=1;
                    break;
                }
            }
            //System.out.println("Variable :" +ar2.variables.get(i)+" valor:"+valor);
            pelista.insertar(valor,"variable",ar2.variables.get(i),"archivo2.js");
        }
        //Comentario archivo1
        valor=0;
        for(int i=0;i<ar1.Comentarios.size();i++){
            valor=0;
            for(int j=0;j<ar2.Comentarios.size();j++){
                if(ar1.Comentarios.get(i).toString().equalsIgnoreCase(ar2.Comentarios.get(j).toString())){
                    valor+=1;
                    break;
                }
            }
            //System.out.println("Comentarios :" +ar1.Comentarios.get(i)+" valor:"+valor);
            pelista.insertar(valor,"comentario",ar1.Comentarios.get(i),"archivo1.js");
        }
        //Comentario archivo2
        for(int i=0;i<ar2.Comentarios.size();i++){
            valor=0;
            for(int j=0;j<ar1.Comentarios.size();j++){
                if(ar2.Comentarios.get(i).toString().equalsIgnoreCase(ar1.Comentarios.get(j).toString())){
                    valor+=1;
                    break;
                }
            }
            //System.out.println("Comentarios :" +ar2.Comentarios.get(i)+" valor:"+valor);
            pelista.insertar(valor,"comentario",ar2.Comentarios.get(i),"archivo2.js");
        }
 
    }
    
    
    public static double pgeneral(copyanalyzer.ArchvioJS ar1,copyanalyzer.ArchvioJS ar2){
        double resultado=0;
        double clases_repetidas=0;
        double variables_repetidas=0;
        double comentarios_repetidos=0;
        double metodos_repetidos=0;
        //pgeneral clases
       if(ar1.NClase.toString().equalsIgnoreCase(ar2.NClase.toString()))
            clases_repetidas+=2;
        else if(ar1.lineasclass==ar2.lineasclass)
            clases_repetidas+=2;
        else if(ar1.Metodos.equals(ar2.Metodos))
            clases_repetidas+=2;
        clases_repetidas/=2;
        resultado+=clases_repetidas*0.3;
        //System.out.println(resultado);
        //pgeneral metodos
        for(int i=0;i<ar1.Metodos.size();i++){
            for(int j=0;j<ar2.Metodos.size();j++){
                if((ar1.Metodos.get(i).toString().equalsIgnoreCase(ar2.Metodos.get(j).toString()))&&(((ar1.lineasmetodo.get(i).toString().equalsIgnoreCase(ar2.lineasmetodo.get(j).toString())))||(ar1.cant_parametros.get(i).toString().equalsIgnoreCase(ar2.cant_parametros.get(j).toString())))){
                    metodos_repetidos+=2;break;
                }
                else if((ar1.Metodos.get(i)!=ar2.Metodos.get(j))&&((ar1.lineasmetodo.get(i).toString().equalsIgnoreCase(ar2.lineasmetodo.get(j).toString())))&&(ar1.cant_parametros.get(i).toString().equalsIgnoreCase(ar2.cant_parametros.get(j).toString()))){
                    metodos_repetidos+=1;break;
                }
            }
        }
        metodos_repetidos/=((ar1.Metodos.size())+(ar2.Metodos.size()));
        resultado+=metodos_repetidos*0.3;
        //System.out.println(resultado);
        //pgeneral variables
         for(int i=0;i<ar1.variables.size();i++){
            for(int j=0;j<ar2.variables.size();j++){
                if(ar1.variables.get(i).toString().equalsIgnoreCase(ar2.variables.get(j).toString())){
                    variables_repetidas+=2;
                    break;
                }
            }
        }
        variables_repetidas/=((ar1.variables.size())+(ar2.variables.size()));
        resultado+=variables_repetidas*0.2;
        //System.out.println(resultado);
        //pgeneral comentarios
        for(int i=0;i<ar1.Comentarios.size();i++){
            for(int j=0;j<ar2.Comentarios.size();j++){
                if(ar1.Comentarios.get(i).toString().equalsIgnoreCase(ar2.Comentarios.get(j).toString())){
                    comentarios_repetidos+=2;
                    break;
                }
            }
        }
        comentarios_repetidos/=((ar1.Comentarios.size())+(ar2.Comentarios.size()));
        resultado+=comentarios_repetidos*0.2;
        //System.out.println(resultado);
        return resultado;
    }
    
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
