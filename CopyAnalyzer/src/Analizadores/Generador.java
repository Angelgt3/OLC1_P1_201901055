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
public class Generador {
    public static void main(String[] args) 
    {
        generarAnalizadores();
    }
    
    private static void generarAnalizadores() 
    {
        try {
            String ruta = "src/analizadores/";
            String opcFlex[] = {ruta + "LexicoA1.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCUP[] = {"-destdir", ruta, "-parser", "SintacticoA1", ruta + "SintacticoA1.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();  
        }
    }
}
