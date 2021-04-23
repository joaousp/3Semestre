package br.usp.exercicio03;

public class Main {
    public static void main(String[] args){
        
        Polinomio umPolinomio = new Polinomio(5);
        umPolinomio.addTermo(5, 5);
        umPolinomio.addTermo(3, 3);
        umPolinomio.addTermo(2, 2);
        umPolinomio.addTermo(1, 1);
        umPolinomio.addTermo(0, 0);
        umPolinomio.addTermo(6, 6);
        umPolinomio.mostrarPolinomio();
        umPolinomio.addTermo(4, 4);
        umPolinomio.mostrarPolinomio();
        umPolinomio.addTermo(1, 5);
        umPolinomio.calcularPolinomio();
    }
}
