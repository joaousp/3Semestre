package br.usp.exercicio02;

public class DriverVideo {
    boolean bLigado; // Driver ligado ou desligado
    boolean bEnergia; // Driver energizado ou nao
    int iBrilho; // Porcentagem de brilho da tela
    int iTela; // Resolucao da tela
    
    // Construtor
    DriverVideo (boolean statusEnergia, int pctgBrilho, int resTela){
        bLigado = false;
        bEnergia = statusEnergia;
        iBrilho = pctgBrilho;
        iTela = resTela;
    }
    
    public void ligarDriverVideo(){
        if(bEnergia){
            System.out.println("Driver de Video Ligado.");
            bLigado = true;
        }
        else{
            System.out.println("Driver de Video Sem Energia.");
        }
    }
    
    private boolean verificarStatus(){
        if(!bLigado){
            return false;
        }
        else{
            System.out.println("Driver de Video Funcionando Normalmente.");
            System.out.println("Brilho: " + iBrilho + "%.");
            System.out.println("Resolucao: " + iTela + "p.");
            return true;
        }
    }
    
    public void testarVideo(){
        System.out.println("Teste de Driver de Video Iniciado");
        if(verificarStatus()){
            System.out.println("Teste de Driver de Video Finalizado");
        }
        else{
            System.out.println("Driver de Video Desligado ou Sem Energia.");
            System.out.println("Teste de Driver de Video Finalizado");
        }   
    }
    
    public void alterarBrilho(int novoBrilho){
        iBrilho = novoBrilho;
    }
    
    public void alterarResolucao(int novaResolucao){
        iTela = novaResolucao;
    }
}
