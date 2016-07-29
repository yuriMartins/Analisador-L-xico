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
        String pau = "1arr()?";
        String pau1 = "1.9.9";
        String pau2 = "/";
        String pau3 = ">>";
        String pau4 = "nao";
        String pau5 = "{kgedjfghf$ erere}";
        String pau6 = "\"aaaaa12$ aa\"";
        String pau7 = "'1'";
        String pau8 = "programa";
                  boolean teste = pau.matches("^([a-zA-Z])\\w*$");//Identificador
                  boolean teste1 = pau1.matches("^([-])?([0-9]+\\.)?\\d+");//Número
                  boolean teste2 = pau2.matches("[\\+\\-\\*\\/]");//Operadores Aritméticos
                  boolean teste3 = pau3.matches("[\\>\\<\\=]|<>|>=|<=");//Operadores Relacionais
                  boolean teste4 = pau4.matches("nao|e|ou");//Operadores Lógicos
                  boolean teste5 = pau5.matches("^\\{.*\\}$");//Comentários
                  boolean teste6 = pau6.matches("^\"[a-zA-Z][\\d|[a-zA-Z]|\\s]*\"$");//Cadeia de Caracteres
                  boolean teste7 = pau7.matches("^\\'([a-zA-Z]|\\d)\\'$");//Caractere
                  boolean teste8 = pau8.matches("programa|const|var|funcao|inicio|fim|se|entao|senao|enquanto|faca|leia|escreva|inteiro|real|booleano|verdadeiro|falso|cadeia|caractere");//Palavras Reservadas
                  System.out.print(teste6);
        
        
        
        
        
    }
    
}
