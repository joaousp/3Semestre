package br.usp.exercicio03;

import java.util.ArrayList;

public class Polinomio{
    ArrayList<Termo> listaTermos = new ArrayList<>();
    ArrayList<Termo> tempLista = new ArrayList<>();
    int grauMaximo;
    boolean existeExp = false;
    
    // Construtor
    Polinomio(int gMax){
        grauMaximo = gMax;
    }
    
    public void addTermo(int novoCoe, int novoExp){
        Termo novoTermo = new Termo(novoCoe, novoExp);
        
        if(novoTermo.iExp > grauMaximo){
            System.out.print("Impossivel Adicionar: ");
            System.out.print(novoTermo.iCoe + "x^" + novoTermo.iExp + ". ");
            System.out.println("Expoente maior do que o grau maximo!");
        }
        else{
            for (Termo atualTermo : listaTermos){
                if(atualTermo.iExp == novoTermo.iExp){
                    atualTermo.iCoe += novoTermo.iCoe;
                    existeExp = true;
                }
            }
            
            if(!existeExp){
                listaTermos.add(novoTermo);
            }
        }
    }
    
    public void mostrarPolinomio(){
        organizarPolinomio();
        
        System.out.print("Polinomio atual: ");
        
        for(int i = 0 ; i < listaTermos.size() ; i++){
            if(tempLista.get(i).iExp != 0){
                System.out.print(listaTermos.get(i).iCoe + "x^" + tempLista.get(i).iExp + " + ");
            }
            else{
                System.out.println(listaTermos.get(i).iCoe + "x^" + tempLista.get(i).iExp);
            }
        }
    }
    
    private void organizarPolinomio(){
        int tempA;
        
        tempLista.clear();
        
        for(tempA = grauMaximo ; tempA > -1 ; tempA--){
            for (Termo atualTermo : listaTermos){
                if(atualTermo.iExp == tempA){
                    tempLista.add(atualTermo);
                }
            }
        }
        
        listaTermos.clear();
        
        for (Termo atualTermo : tempLista){
            listaTermos.add(atualTermo);
        }
    }
    
    public void calcularPolinomio(){
        int somaPolinomio = 0;
        
        for (Termo atualTermo : listaTermos){
            somaPolinomio += Math.pow(atualTermo.iCoe, atualTermo.iExp);
        }
        
        System.out.print("Somando Polinomio: ");
        
        for(int i = 0 ; i < listaTermos.size() ; i++){
            if(tempLista.get(i).iExp != 0){
                System.out.print(listaTermos.get(i).iCoe + "x^" + tempLista.get(i).iExp + " + ");
            }
            else{
                System.out.println(listaTermos.get(i).iCoe + "x^" + tempLista.get(i).iExp + " = " + somaPolinomio);
            }
        }
    }
    
}
