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
public class ProxyAcesso {
    Sistema acessoProtegido;

    public ProxyAcesso(String usuario, int senha) {
        acessoProtegido=new Sistema(usuario, senha);
    }
    
     public void acessarSistema(String usuario, int senha){
        if(usuario==acessoProtegido.getUsuario()&&senha==acessoProtegido.getSenha()){
            System.out.println("Usuario esta online");
            acessoProtegido.setOnline(true);
        }else
            System.out.println("Informacoes erradas, tente novamente");
    }
    public void guardarDados(String informacoes){
        if(informacoes.contains("789")){
            throw new Error("ERRO: codigo possivelmente maliciosso");
        }
        else{
            if(acessoProtegido.isOnline()==true){
                acessoProtegido.setInformacaoASerGuardada(informacoes);
            }
            else{
                System.out.println("Faça o login");
            }
        }
    }
    
}
