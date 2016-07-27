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
public class Token {
    
    //private ArrayList<String>lexemas = new ArrayList<String>();
    private String nome;
    private int tipo;
    private int linha;
    
     public Token(String nome, int tipo, int linha){
        this.nome = nome;
        this.tipo = tipo;
        this.linha = linha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }
    
   
    public boolean verifica(String lexema){
        
        
       
        return true;
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
}
