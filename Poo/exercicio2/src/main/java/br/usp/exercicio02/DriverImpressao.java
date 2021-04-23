package br.usp.exercicio02;

public class DriverImpressao {
    //vou simplificar o maximo possivel
    /*
    o driver vai receber um texto e um numero de paginas
    como isso Ã© uma simplificacao, o texto vai ser impresso em x
    paginas que o SO vai enviar.
    Alem disso, tbm recebe um sinal se a energia esta ligada
    */
    boolean energia;
    boolean dLigado;
    
//contrutor padrao 
    DriverImpressao(boolean estadoEnergia) {
        energia = estadoEnergia;
        dLigado = false;
    }
    
    //sessao de funcoes
    //como Ã© um programa simpplificado, vou fazer apenas as funcoes mais basicas
    public void ligarDriverImpressao(){
        if (energia){
            System.out.println("Driver de Impressao ligado");
            dLigado = true;
        }else System.out.println("Driver de impressao sem energia");
    }
    
    private boolean verificaStatus(){
        if(!dLigado){
            System.out.println("Driver desligado e nao pode ser analisado"); 
            return false;
        }
        else{
            System.out.println("Driver ligado e pronto para impressao");
            return true;
        }
        
    }
    
    public void imprimePaginas(String frase, int n){
        System.out.println("Iniciando Impressao...");
        for (int i = 0; i < n; i++) {
            System.out.println(frase); 
        }
    }
    
    public void executaTesteImpressao(){
        if(verificaStatus()){
            imprimePaginas("TESTE DE IMPRESSAO COMPLETO",1);
        }
        else{
            System.out.println("Por Favor, ligue o driver de impressao");
        }
    }
    
}

