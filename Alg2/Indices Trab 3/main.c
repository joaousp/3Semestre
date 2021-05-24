#include "funcoes.h"
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
//-----------------------


int main(){
    //variaveis
    FILE *arquivoPrincipal=fopen(NOMEARQUIVOPRINCIPAL,"w+b");
    FILE *arquivoIndice=fopen(NOMEARQUIVOINDICE,"w+b");
    char sair[]="exit";
    char inserir[]="insert";
    char buscar[]="search";
    char deletar[]="delete";
   
    char buffer[REGSIZE];//para insert
    char ordem[20+REGSIZE];//para receber a ordem 
    int indicadorErro;
    separador *separa;
    
    while(1){
        
    
        fgets(ordem,REGSIZE,stdin);//ordem+textorecebido
        fflush(stdin);
        /*acabei utilizando desse if,
        **pois quando ocorria exit sozinho dava seg fault
        **sei q é uma forma preguicosa, mas fiquei em tempo
        **o unico comando curto é o exit
        */
        if(strlen(ordem)<6){
            break;
        }

        separa= ler_e_separar(ordem);
       
        if(strcmp(separa->ordem,inserir)==0){
            //fgets(buffer,REGSIZE,stdin);
            
            indicadorErro=ler_do_teclado(separa->imput,arquivoPrincipal,arquivoIndice);
            if(indicadorErro<0){
                //tudocerto
                printf("O Registro ja existe!\n");
            }
            
           
        }
        
        if(strcmp(separa->ordem,buscar)==0){
            //printf("Entrou na busca\n");
            //aqui, vou buscar baseado no indice
            //separa->imput possui o nusp q desejo encontrar
            int resultado= encontrar_exibir(atoi(separa->imput),arquivoPrincipal,arquivoIndice);
            if(resultado<0){
                //tudocerto
                printf("Registro nao encontrado!\n");
            }
        }
        if(strcmp(separa->ordem,deletar)==0){
            //nao preciso retornar nada pro delete
            deletarArquivo(atoi(separa->imput),arquivoPrincipal,arquivoIndice);

            //nesse caso, apagar do indice
            //colocar o caractere no principal
        }
       /* if(strcmp(separa->ordem,sair)==0||separa==NULL){
            
            break;
            //nesse caso, apagar do indice
            //colocar o caractere no principal
        }
    */
   
    
   
    
    }
    free(separa);
        
    fclose(arquivoPrincipal);
    fclose(arquivoIndice);
    
}
