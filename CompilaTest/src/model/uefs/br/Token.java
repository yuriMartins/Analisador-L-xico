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
    
    private ArrayList<String>lexemas = new ArrayList<String>();
    private String nome;
    private int tipo;
    
    public Token(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public boolean verifica(String lexema){
        
        
       
        return true;
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
}
