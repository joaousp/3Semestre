package br.usp.exercicio02;

public class Main { 
    public static void main(String[] args){
        System.out.println("------------- Driver de Video -------------");
        /*
        Cria o objeto para o Driver de Video
        Liga o Driver
        Testa o Driver
        Altera Brilho e Resolucao
        Testa Novamente
        */
        DriverVideo umDriverVideo = new DriverVideo(true, 75, 1080);
        umDriverVideo.ligarDriverVideo();
        umDriverVideo.testarVideo();
        umDriverVideo.alterarBrilho(50);
        umDriverVideo.alterarResolucao(720);
        umDriverVideo.testarVideo();
        
        System.out.println("\r\n------------- Driver de Rede --------------");
        /*
        Cria o objeto para o Driver de Rede
        Liga o Driver
        Conecta o Dispositivo a Rede
        Testa Rede
        Envia Pacote de Dados
        */
        DriverRede umDriverRede = new DriverRede(false, 78);
        umDriverRede.ligarDriverRede();
        umDriverRede.conectarRede();
        umDriverRede.testarRede();
        umDriverRede.enviarPacoteDados();
        
        System.out.println("\r\n----------- Driver de Impressao -----------");
        /*
        Cria o objeto para o Driver de Impressao
        Liga o Driver
        Imprime o texto na quantidade indicada
        */
        DriverImpressao umDriverImpressao = new DriverImpressao(true);
        umDriverImpressao.ligarDriverImpressao();
        umDriverImpressao.executaTesteImpressao();
        umDriverImpressao.imprimePaginas("IMPRIMA ISSO", 3);
        
    }
}
