package model.uefs.br;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuri Silva
 */
public class Analisador {
    
    static  final int IDENTIFICADOR = 1;
    static final int NUMERO = 2;
    static final int DIGITO = 3;
    static final int LETRA = 4;
    static final int ARITMETICOS = 5;
    static final int RELACIONAIS = 6;
    static final int LOGICOS = 7;
    static final int DEL_COMENT = 8;
    static final int DELIMITADORES = 9;
    static final int CADEIA_DE_CARACTERES = 10;
      
       
    private ArrayList<Token> tokens = new ArrayList();
      private ArrayList<String> linhas_arq = new ArrayList<String>();
    
    public void lerArq(String arquivo){
        linhas_arq = LerArq.ler(arquivo);
    }
    
    public void separaTokens() {
        
        int ch = 0;
    
   for(int i=0;i < linhas_arq.size();i++){
       
       String temp = linhas_arq.get(i);
        
       while(ch < temp.length()){
           int t = temp.charAt(ch);
        
           if((t<=90 && t>=65) || (t>=97 && t<=122)) {
               int a = temp.charAt(ch+1);
              if(a == 32 ||a == 13|| a == 59||a == 44|| a == 43||a == 45||a == 42||a == 47||a == 60|| a == 62|| a == 61|| a == 34||a == 39){
                  Token novo = new Token(temp.substring(ch, ch + 1),LETRA);
                  tokens.add(novo);
                  
              }
          }
           
           if()
           
           
           
           
           
           
           
           ch ++;
       }
       
       
       
       
       
       
       
       
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    public void imprimiTokens(){
        System.out.println(tokens);
    }
    
    public void mostrarLinhas(){
        System.out.println(linhas_arq);
    }
   
    
    
    
}
