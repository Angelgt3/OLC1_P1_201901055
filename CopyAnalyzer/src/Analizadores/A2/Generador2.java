/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

/**
 *
 * @author angge
 */
public class Generador2 {
    public static void main(String[] args) 
    {
        generarAnalizadores();
    }
    
    private static void generarAnalizadores() 
    {
        try {
            String ruta = "src/analizadores/A2/";
            String opcFlex[] = {ruta + "LexicoA2.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCUP[] = {"-destdir", ruta, "-parser", "parserA2", ruta + "SintacticoA2.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();  
        }
    }
}
