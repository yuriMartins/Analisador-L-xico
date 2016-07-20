/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.uefs.br;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class LerArq {
    
    private String arquivo;
    private static ArrayList<String> linhas_arq = new ArrayList<String>();
    
	public static ArrayList<String> ler(String caminho){
		try{
			String nome = caminho;
			
                    try (BufferedReader br = new BufferedReader(new FileReader(nome))) {
                        while(br.ready()){
                            String linha = br.readLine();
                            linhas_arq.add(linha);
                        //System.out.println(linha);
                        }
                    }
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
                return linhas_arq;
        }
}
        
