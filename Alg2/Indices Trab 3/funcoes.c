#include "funcoes.h"




//funcao aproveitada do warmup 1

void print_data(reg *data){
    printf("-------------------------------\n");
    printf("USP number: %d\n",data->nUSP);
    printf("Name: %s\n",data->name);
    printf("Surname: %s\n",data->lastname);
    printf("Course: %s\n",data->course);
    printf("Test grade: %.2f\n",data->grade);
    printf("-------------------------------\n");
}

int ler_do_teclado(char *linha,FILE *fp,FILE *fIndice){
    //padrao de leitura é do tipo:
    //nusp,nome,curso,nota
    //existe um caracter (,) q aparece apos cada campo
    //sendo assim usarei strtok para cortar a string

    const char delimitador[2]= ",";
    char *NUSPtemporario,*NAMEtemporario,*LASTNAMEtemporario,*COURSEtemporario,*GRADEStemporario;
    
    //verificar se a linha nao é nula
    if(linha==NULL){
        return -1;
    }

    //alocar memoria
    reg *temporario=(reg *)malloc(sizeof(reg));
    if(temporario==NULL){
        return -1;
    }
    indice *tempi=(indice*)malloc(sizeof(indice));
    if(tempi==NULL){
        return -1;
    }

    //NUSP
    
    if((NUSPtemporario=strtok(linha,delimitador))!=NULL){
        sscanf(NUSPtemporario,"%d",&temporario->nUSP);
        tempi->nUSP=atoi(NUSPtemporario);
    }
   // printf("temporario usp: %d ",temporario->nUSP);

    //name
    if((NAMEtemporario=strtok(NULL,delimitador))!=NULL){
        strcpy(temporario->name,NAMEtemporario);
    }
   // printf("temporario usp: %s ",temporario->name);
    //lastname
    if((LASTNAMEtemporario=strtok(NULL,delimitador))!=NULL){
        strcpy(temporario->lastname,LASTNAMEtemporario);
    }
   // printf("temporario usp: %s ",temporario->lastname);    
    //curso
    if((COURSEtemporario=strtok(NULL,delimitador))!=NULL){
        strcpy(temporario->course,COURSEtemporario);
    }
    //printf("temporario usp: %s ",temporario->course);
    
    //nota
    if((GRADEStemporario=strtok('\0',delimitador))!=NULL){
        temporario->grade=atof(GRADEStemporario);
    }
    //printf("temporario usp: %f ",temporario->grade);
    int i;
    int rrn_existente= ler_indice_retornar_rrn(temporario->nUSP,fIndice);
    if(rrn_existente!=-1){
        
        return -1;
    }


    i=gravar_no_arquivo(temporario,fp);
    //i=posicao
    
    tempi->RRN=i;
    

    gravar_no_indice(tempi,fIndice);
    
    return i ;
}





separador *ler_e_separar(char *buffer){
    if(buffer==NULL)return NULL;
    const char delimitador[2]=" ";
    //vou separar a ordem do resto, usando o " "
    
    
    char *ORDEMtemporario;
    char *RESTOtemporario;
    separador *temporario=(separador *)malloc(sizeof(separador));
    //struct com 2 espacos, 1 palavra e o resto de tamanho REGSIZE
    
    if(temporario==NULL)return NULL;

    if((ORDEMtemporario=strtok(buffer,delimitador))!=NULL){
        strcpy(temporario->ordem,ORDEMtemporario);
    }
    
    if((RESTOtemporario=strtok(NULL,"\0"))!=NULL){
        strcpy(temporario->imput,RESTOtemporario);
    }
    //usando o strtok, verifico cada caso
    return temporario;

}



int encontrar_exibir(int nUSP,FILE *arquivoPrincipal, FILE *arquivoIndice){
    //apartir do nusp, encontro o rrn no arquivo indice
    
    int rrn=ler_indice_retornar_rrn(nUSP,arquivoIndice);
    
    if(rrn==-1){
        //caso -1, ou foi apagado, ou nao existe
        return -1;
    }
    else{
        //apos ser encontrado,localizar no arquivo principal
        print_diretamente_tela(arquivoPrincipal,rrn-1);
    }
}
