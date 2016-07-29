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
    private boolean status;
    
    
    public Token(String nome, int tipo, int linha, String expressaoRegular){
        this.nome = nome;
        this.tipo = tipo;
        this.linha = linha;       
        this.status = nome.matches(expressaoRegular);
    }
    
    public Token(String nome, int tipo, int linha, boolean status){
        this.nome = nome;
        this.tipo = tipo;
        this.linha = linha;       
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        return nome + "|" + status + "|" + tipo;
    }
    
    
}
