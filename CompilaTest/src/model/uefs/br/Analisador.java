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
    static final int ARITMETICOS = 3;
    static final int RELACIONAIS = 4;
    static final int LOGICOS = 5;
    static final int DEL_COMENT = 6;
    static final int DELIMITADORES = 7;
    static final int CADEIA_DE_CARACTERES = 8;
    static final int CARACTER = 9;
    static final int NEGATIVO = 45;
      
       
    private ArrayList<Token> tokens = new ArrayList();
      private ArrayList<String> linhas_arq = new ArrayList<String>();
    
    public void lerArq(String arquivo){
        linhas_arq = LerArq.ler(arquivo);
    }
    
    public void separaTokens() {
        
        int ch = 0;
    
   for(int i=0;i < linhas_arq.size();i++){
       
       String temp = linhas_arq.get(i);
       String lexema;
        int tamanho = temp.length();
        
        
        
        
        while(ch < tamanho){
        int t = isToken((int)temp.charAt(ch),ch,temp);
        int current_last = ch;        
        
           
           
          switch (t){
              
              case IDENTIFICADOR:                  
                  current_last = delimitadorId(ch,temp);
                  String novo = temp.substring(ch, current_last);
                  Token t1 = new Token(novo, IDENTIFICADOR);
                  tokens.add(t1);
                  
                  ch = current_last;
              break;
                  
              case NUMERO: 
                  
                  break;
              
              case CADEIA_DE_CARACTERES:
                  
                  break;
                  
                  case CARACTER:
                  
                  break;
                  
                  case ARITMETICOS:
                  //ch++;
                  break;
                  
                  case RELACIONAIS:
                  
                  break;
                  
                  case DEL_COMENT:
                  
                  break;
                  
                  case DELIMITADORES:
                  ch++;
                  break;
                  
                  case -1:
                      
                      break;
                  
              
          }
       
        }
 }
    }
    
    private int isToken(int cod, int index, String temp){
        
        if(isLetra(cod)) return IDENTIFICADOR; // Identificador,palavras reservadas, 
        else if(cod == 34) return CADEIA_DE_CARACTERES;
        else if(cod == 39) return CARACTER;
        else if(cod == 45){
                    int a = temp.charAt( index +1);
                    if(isNumero(a)) return NUMERO;
                    else return ARITMETICOS;
                 }
        else if(cod == 43 || cod == 42 || cod == 47) return ARITMETICOS;
        else if(cod >=60 && cod <= 62) return RELACIONAIS;
        else if(cod == 123) return DEL_COMENT;
        else if(cod == 40 || cod == 32 || cod == 59 || cod == 44) return DELIMITADORES;
        
         
        else return -1;// 
    }
    
    
    
    
    private boolean isLetra(int c){
        if ( (c>= 97 && c <=122) || (c>= 65 && c <=90)){
            return true;
        }
        
        else return false;
    }
    
    private boolean isNumero(int c){
        if ( (c>= 48 && c <=57)) return true;        
        else return false;
    }
    
    private int delimitadorId(int ch, String temp){// Retorna o indice do primeiro delimitador encontrado.
        int a = temp.charAt(ch);
        while(ch < temp.length()){
        if(a == 32 || a == 59||a == 44|| a == 43||a == 45||a == 42||a == 47||a == 60|| a == 62|| a == 61|| a == 34||a == 39 ){
            return ch;
        }
        ch++;
        a = temp.charAt(ch);
        }
        return temp.length() - 1;
    }
    
    public void imprimiTokens(){
        System.out.println(tokens);
    }
    
    public void mostrarLinhas(){
        System.out.println(linhas_arq);
    }
   
    
    
    
}
