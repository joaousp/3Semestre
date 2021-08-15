/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista8ex8;

/**
 *
 * @author joaom
 */
public class FilteredSistema extends ProxyAcesso{
    
    public FilteredSistema(String usuario, int senha) {
        super(usuario, senha);
    }
    
    
     
    @Override
    public void guardarDados(String informacoes){
        if(informacoes.contains("789")){
            System.out.println("Dados alterados para a sua seguranca");
            informacoes = informacoes.replace("789", "987");
        }
        if(acessoProtegido.isOnline()==true){
            acessoProtegido.setInformacaoASerGuardada(informacoes);
        }
        else{
            System.out.println("Faça o login");
        }
    }
    public void ExibirDados(){
        System.out.println(acessoProtegido.getInformacaoASerGuardada());
    }
}
