#include"funcoes.h"




//-----------------------



int main(){
    //variaveis
    FILE *fp=fopen(NOMEARQUIVO,"w+b");

    //lendo o csv do teclado
    char buffer[REGSIZE]; 
    reg *temporario;
    while(fgets(buffer,REGSIZE,stdin)!=NULL){
        //uso o strtok na funcao e retorno a struct ja feita
        temporario=ler_do_teclado(buffer);
        if(temporario!=NULL) gravar_no_arquivo(temporario,fp);
    }
    free(temporario);
    
    //agr trabalhanco com a leitura
    setar_arquivo_ler(fp);  
    fclose(fp);
}


//------------------------------



