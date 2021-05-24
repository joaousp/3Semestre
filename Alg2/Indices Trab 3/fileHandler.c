#include "funcoes.h"



void print_diretamente_tela(FILE *fp,int comeco){
    reg *data=(reg*)malloc(sizeof(reg));
   
    //preciso usar fseek
    fseek(fp,comeco*REGSIZE,SEEK_SET);
    
    fread(&data->nUSP,sizeof(int),1, fp);
    fread(&data->name,50,1, fp);
    fread(&data->lastname,50,1, fp);
    fread(&data->course,50,1, fp);
    fread(&data->grade,sizeof(float),1, fp);
    print_data(data);        
    
    free(data);
}


int gravar_no_arquivo(reg *data, FILE *fp){
    fseek(fp,0,SEEK_END);
    //teste de erro
    if(fp==NULL||data==NULL) return 0;
    //print_data(data);
    //escrever no arquivo
    fwrite(&data->nUSP,sizeof(int),1,fp);
    fflush(fp);
    fwrite(&data->name,sizeof(data->name),1,fp);
    fflush(fp);
    fwrite(&data->lastname,sizeof(data->lastname),1,fp);
    fflush(fp);
    fwrite(&data->course,sizeof(data->course),1,fp);
    fflush(fp);
    fwrite(&data->grade,sizeof(float),1,fp);
    fflush(fp);
    //retorna a posicao no arquivo principal
    //print_data(data);
    //print_diretamente_tela(fp,data->nUSP-1);
    
    return ((ftell(fp)/REGSIZE));
}



void gravar_no_indice(indice *data,FILE *indice){
    //teste de erro
    if(indice==NULL||data==NULL) return ;
    
    //print_data(data);
    //escrever no arquivo o nusp
    fwrite(&data->nUSP,sizeof(int),1,indice);
    fflush(indice);
    
    //escrever a posicao
    fwrite(&data->RRN,sizeof(int),1,indice);
    fflush(indice);   
    

}




int ler_indice_retornar_rrn(int nusp,FILE *arquivoIndice){
    indice *temporario=(indice*)malloc(sizeof(indice));

    fseek(arquivoIndice,0,SEEK_SET);
    

    while(!feof(arquivoIndice)){
        fread(&temporario->nUSP,4,1, arquivoIndice);
        fread(&temporario->RRN,4,1, arquivoIndice);       
        if(temporario->nUSP==nusp){
            break;
        } 
    }
    
    if(temporario->nUSP==nusp) return temporario->RRN;
    else return -1;
    //lembrete, vou modificar o rrn para -1 quando apaga-lo
}



void deletarArquivo(int nUSP,FILE *arquivoPrincipal,FILE *arquivoIndice){
    //primeiramente, verificar se existe nusp no indice
    
    indice *temporario=(indice*)malloc(sizeof(indice));
    int rrn;

    fseek(arquivoIndice,0,SEEK_SET);
    

    while(!feof(arquivoIndice)){
        fread(&temporario->nUSP,4,1, arquivoIndice);
        fread(&temporario->RRN,4,1, arquivoIndice);       
        if(temporario->nUSP==nUSP){
            break;
        } 
    }
    
    if(temporario->nUSP==nUSP) {
        rrn=temporario->RRN;
        fseek(arquivoIndice,-4,SEEK_CUR);
        int atualizacao=-1;
        fwrite(&atualizacao,sizeof(int),1,arquivoIndice);
        
    }
    else rrn =-1;
    
    if(rrn==-1){
        //se nao encontrado, retornar nada  
        return ;
    }
    else{
        
        fseek(arquivoPrincipal,(rrn-1)*REGSIZE,SEEK_SET);
        char elemento[]="//*";
        fwrite(&elemento,sizeof(elemento),1,arquivoPrincipal);
        return;
        
    }
}
