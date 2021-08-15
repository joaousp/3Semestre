/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.exercicio3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author joaom
 */
public class No<T extends Comparable> {
    private boolean ehRaiz;
    private T value;
    private No filhoEsq;
    private No filhoDir;

    public No(T value) {
        ehRaiz=false;
        this.value = value;
        filhoEsq=null;
        filhoDir=null;
        
    }

    public boolean isEhRaiz() {
        return ehRaiz;
    }

    public void setEhRaiz(boolean ehRaiz) {
        this.ehRaiz = ehRaiz;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public No getFilhoEsq() {
        return filhoEsq;
    }

    public void setFilhoEsq(No filhoEsq) {
        this.filhoEsq = filhoEsq;
    }

    public No getFilhoDir() {
        return filhoDir;
    }

    public void setFilhoDir(No filhoDir) {
        this.filhoDir = filhoDir;
    }
    
    public void adiciona(T umValor) throws Exception{
        if(isEhRaiz()==false){
            throw new Exception("Adicoes so sao permitidas via raiz");
        }
        else{
            this.adicionaRecursivo(umValor);
        }
    }
    public void adicionaRecursivo(T umValor) throws Exception{
        if(umValor.compareTo(getValue())>0){
            if(getFilhoDir()==null){
                setFilhoDir(new No(umValor));
            }
            else{
                getFilhoDir().adicionaRecursivo(umValor);
            }
        }
        else{
            if(getFilhoEsq()==null){
                setFilhoEsq(new No(umValor));
            }
            else{
                getFilhoEsq().adicionaRecursivo(umValor);
            }
        }
    }
    
    public  void percorre(){
        if(getFilhoEsq()!=null){
            getFilhoEsq().percorre();
           
        }
        System.out.println(getValue());
        if(getFilhoDir()!=null){
            getFilhoDir().percorre();
        }
    }
    public void Busca(T umValor)throws Exception{
        if(isEhRaiz()==false){
            throw new Exception("Busca so sao permitidas via raiz");
        }
        else{
            this.buscaRecursiva(umValor);
        }
    }
    public void buscaRecursiva(T umValor) throws Exception{
        if(umValor.compareTo(getValue())>0){
            if(getFilhoDir()==null){
                System.out.println("Nao encontrado");
            }
            else{
                getFilhoDir().buscaRecursiva(umValor);
            }
        }
        else if(umValor.compareTo(getValue())<0){
            if(getFilhoEsq()==null){
                System.out.println("Nao encontrado");
            }
            else{
                getFilhoEsq().buscaRecursiva(umValor);
            }
        }
        else{
            System.out.println("Foi encontrado");
        }
        
    }
    
    public void Remocao(T umValor)throws Exception{
        if(isEhRaiz()==false){
            throw new Exception("Remocoes so sao permitidas via raiz");
        }
        else{
            int aux=this.remocaoRecursiva(umValor);
        }
    }
    public int remocaoRecursiva(T umValor) throws Exception{
        if(umValor.compareTo(getValue())>0){
            if(getFilhoDir()==null){
                System.out.println("Nao encontrado");
                return 0;
            }
            else{
                int aux=getFilhoDir().remocaoRecursiva(umValor);
                if(aux==1){
                    No<T> deletar =getFilhoDir();
                    if(deletar.getFilhoDir()==null && deletar.getFilhoEsq()==null){//caso folha
                        setFilhoDir(null);
                    }
                    else if(deletar.getFilhoDir()!=null && deletar.getFilhoEsq()==null){//caso em que so o direito nao é 
                        setFilhoDir(deletar.getFilhoDir());
                    }
                    else if(deletar.getFilhoDir()==null && deletar.getFilhoEsq()!=null){//caso em que so o esquerdo nao é 
                        setFilhoDir(deletar.getFilhoEsq());
                    }
                    else{//caso em que os dois estao ocupados
                        No<T> novoNo=getFilhoDir();
                        while(novoNo.getFilhoDir()!=null){
                            novoNo=novoNo.getFilhoDir();//vou indo para a direita ate achar o folha
                        }
                        setFilhoDir(deletar.getFilhoDir());
                        novoNo.setFilhoDir(deletar.getFilhoEsq());
                        
                    }
                    return 0;
                }
                
            }
        }
        else if(umValor.compareTo(getValue())<0){
            if(getFilhoEsq()==null){
                System.out.println("Nao encontrado");
                return 0;
            }
            else{
                int aux=getFilhoEsq().remocaoRecursiva(umValor);
                 if(aux==1){
                    No<T> deletar =getFilhoEsq();
                    if(deletar.getFilhoDir()==null && deletar.getFilhoEsq()==null){//caso folha
                        setFilhoDir(null);
                    }
                    else if(deletar.getFilhoDir()!=null && deletar.getFilhoEsq()==null){//caso em que so o direito nao é 
                        setFilhoEsq(deletar.getFilhoDir());
                    }
                    else if(deletar.getFilhoDir()==null && deletar.getFilhoEsq()!=null){//caso em que so o esquerdo nao é 
                        setFilhoEsq(deletar.getFilhoEsq());
                    }
                    else{//caso em que os dois estao ocupados
                        No<T> novoNo=getFilhoEsq();
                        while(novoNo.getFilhoEsq()!=null){
                            novoNo=novoNo.getFilhoEsq();//vou indo para a direita ate achar o folha
                        }
                        setFilhoEsq(deletar.getFilhoEsq());
                        novoNo.setFilhoEsq(deletar.getFilhoDir());
                        
                    }
                    return 0;
                }
            }
        }
        else{
            System.out.println("Foi encontrado");
            return 1;
             
        }
        return 0;
    }
    
   
    
    
    
}
