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
public class Sistema {
    private String usuario;
    private int senha;
    private String informacaoASerGuardada;
    private boolean online;

    public Sistema(String usuario, int senha) {
        this.usuario = usuario;
        this.senha = senha;
        online=false;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

   
    public String getInformacaoASerGuardada() {
        return informacaoASerGuardada;
    }

    public void setInformacaoASerGuardada(String informacaoASerGuardada) {
        this.informacaoASerGuardada = informacaoASerGuardada;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
    
    public void acessarSistema(String usuario, int senha){
        if(usuario==getUsuario()&&senha==getSenha()){
            System.out.println("Usuario esta online");
            online=true;
        }else
            System.out.println("Informacoes erradas, tente novamente");
    }
    public void guardarDados(String informacoes){
        if(informacoes.contains("789")){
            System.out.println("Falha de seguranca");
            System.out.println("Usuario comprometido");
            System.out.println("Senha alterada para padrao 1234");
            setSenha(1234);
        }
        if(online==true){
            setInformacaoASerGuardada(informacoes);
        }
        else{
            System.out.println("Faça o login");
        }
    }
    
    
    
}
