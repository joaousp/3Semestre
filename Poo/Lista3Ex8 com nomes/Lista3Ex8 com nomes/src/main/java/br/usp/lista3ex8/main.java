/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista3ex8;

 
import java.util.Collections; 
import java.util.ArrayList;


/**
 *
 * @author joaom
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeFutebol saoPaulo= new TimeFutebol(8, 4, 3, 28, 15, 10, 2, "Sao Paulo");
        //27
        TimeFutebol penapolense = new TimeFutebol(7, 2, 6, 28, 15, 10, 2, "Penapolense");
        //27 pontos 1 vitoria
        TimeFutebol linense = new TimeFutebol(7, 2, 6,27, 15, 10, 2, "Linense");
        //27 e saldo menos
        TimeFutebol comercial = new TimeFutebol(7, 2, 6, 26, 14, 10, 2, "Comercial");
        //menos golsMarcados
        TimeFutebol botafogo = new TimeFutebol(7, 2, 6, 26, 14, 10, 3, "Botafogo");
        //mais cartoes vermelhos
        TimeFutebol oeste = new TimeFutebol(7, 2, 6, 26, 14, 11, 3, "Oeste");
        //mais amarelos
        TimeFutebol xv = new TimeFutebol(7, 2, 6, 26, 14, 11, 3, "XV de Piracicaba");
        //sorteio
        
        ArrayList<TimeFutebol> lista = new ArrayList();
        
        lista.add(xv);
        lista.add(oeste);
        lista.add(comercial);
        lista.add(linense);
        lista.add(penapolense);
        lista.add(saoPaulo);
        lista.add(botafogo);
        Collections.sort(lista,Collections.reverseOrder());
        
        for(int i = 0 ; i < lista.size() ; i++){
            System.out.println((i+1) + "º Lugar: " + lista.get(i).getNome());
        }
       
        
        
    }
    
}
