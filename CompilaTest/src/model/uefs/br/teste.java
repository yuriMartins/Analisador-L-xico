/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.uefs.br;

/**
 *
 * @author Kelvin
 */
public class teste {
    
    public static void main(String[] args){
        
        Analisador novo = new Analisador();
        String t = "C:\\Users\\Kelvin\\Downloads\\delimww.txt";
        novo.lerArq(t);
        /*novo.mostrarLinhas();*/
        novo.separaTokens();
        novo.imprimiTokens();
        String pau = "_";
        String pau1 = "-1";
                  boolean teste = pau.matches("^[a-zA-Z][[a-zA-Z]|\\d|_]*$");
                  boolean teste1 = pau1.matches("^-?\\d+[\\.]?[\\d]+");
                  System.out.print(teste1);
        
        
        
        
        
    }
    
}
