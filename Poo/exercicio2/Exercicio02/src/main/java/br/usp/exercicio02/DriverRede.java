package br.usp.exercicio02;

public class DriverRede {
    boolean bLigado; // Driver ligado ou desligado
    boolean bConectado; // Dispositivo conectado a rede
    int iSinal; // Forca do Sinal
    
    // Contrutor
    DriverRede (boolean statusConectado, int forcaSinal){
        bLigado = false;
        bConectado = statusConectado;
        iSinal = forcaSinal;
    }
    
    public void ligarDriverRede(){
        bLigado = true;
        System.out.println("Driver de Rede Ligado.");
    }
    
    public void conectarRede(){
        if(!bLigado){
            System.out.println("Driver Desligado. Impossivel Conectar.");
        }
        else{
            bConectado = true;
            System.out.println("Dispositivo Conectado com Sucesso.");
        }
    }
    
    public void enviarPacoteDados(){
        if(bConectado){
            System.out.println("Pacote de Dados Enviado");
        }
        else{
            System.out.println("O Dispositivo Deve Estar Conectado Para Enviar Pacotes.");
        }
    }
    
    private boolean verificarStatus(){
        if(!bLigado){
            return false;
        }
        else{
            System.out.println("Driver de Rede Ligado.");
            if(!bConectado){
                System.out.println("Nenhuma Rede Conectada.");    
            }
            else{
                System.out.println("Dispositivo Conectado a Rede");
                System.out.println("Forca do Sinal: " + iSinal + "%.");
            }
            return true;
        }
    }
    
    public void testarRede(){
        System.out.println("Teste de Driver de Rede Iniciado");
        if(verificarStatus()){
            System.out.println("Teste de Driver de Rede Finalizado");
        }
        else{
            System.out.println("Driver de Rede Desligado.");
            System.out.println("Teste de Driver de Rede Finalizado");
        }   
    }
}