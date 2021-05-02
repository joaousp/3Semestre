#include "funcoes.h"



struct _reg {
    int nUSP;
    char name[50];
    char course[50];
    float grade;
};

//funcao aproveitada do warmup 1
//como o comeco sera fim-10, da para utilizar a mesma forma
void print_diretamente_tela(FILE *fp,int comeco, int fim){
    reg *data=(reg*)malloc(sizeof(reg));
   
    //preciso usar fseek
    fseek(fp,REGSIZE*comeco,SEEK_SET);

    while(comeco<fim){
        fread(&data->nUSP,sizeof(int),1, fp);
        fread(&data->name,50,1, fp);
        fread(&data->course,50,1, fp);
        fread(&data->grade,sizeof(float),1, fp);
        print_data(data);
        comeco++;
        if(comeco+1<=fim)printf("\n");
    }
    free(data);
}

void print_data(reg *data){
    printf("nUSP: %d\n",data->nUSP);
    printf("Nome: %s\n",data->name);
    printf("Curso: %s\n",data->course);
    printf("Nota: %.2f\n",data->grade);
}

reg *ler_do_teclado(char *linha){
    //padrao de leitura é do tipo:
    //nusp,nome,curso,nota
    //existe um caracter (,) q aparece apos cada campo
    //sendo assim usarei strtok para cortar a string

    const char delimitador[2]= ",";
    char *NUSPtemporario,*NAMEtemporario,*COURSEtemporario,*GRADEStemporario;

    //verificar se a linha nao é nula
    if(linha==NULL){
        return NULL;
    }

    //alocar memoria
    reg *temporario=(reg *)malloc(sizeof(reg));
    if(temporario==NULL){
        return NULL;
    }

    //NUSP
    
    if((NUSPtemporario=strtok(linha,delimitador))!=NULL){
        temporario->nUSP=atoi(NUSPtemporario);
    }

    //name
    if((NAMEtemporario=strtok(NULL,delimitador))!=NULL){
        strcpy(temporario->name,NAMEtemporario);
    }
    
    //curso
    if((COURSEtemporario=strtok(NULL,delimitador))!=NULL){
        strcpy(temporario->course,COURSEtemporario);
    }
    
    //nota
    if((GRADEStemporario=strtok('\0',delimitador))!=NULL){
        temporario->grade=atof(GRADEStemporario);
    }
    

    return temporario;
}

void gravar_no_arquivo(reg *data, FILE *fp){
    //teste de erro
    if(fp==NULL||data==NULL) return ;
    //print_data(data);
    //escrever no arquivo
    fwrite(&data->nUSP,sizeof(int),1,fp);
    fwrite(&data->name,sizeof(data->name),1,fp);
    fwrite(&data->course,sizeof(data->course),1,fp);
    fwrite(&data->grade,sizeof(float),1,fp);
}


void setar_arquivo_ler(FILE *fp){
    int temporario2,temporario3; //temporario1 e 2
    fseek(fp,0,SEEK_END);//pro final do arquivo
   
    temporario2=ftell(fp)/REGSIZE;
    //agr, eu sei quantos estudantes tem no arquivo
    //testar se o usuario colocou mais que 10 elementos
    if(temporario2-10<0)temporario3=0;
    else temporario3=temporario2-10;
    
    fseek(fp,0,SEEK_SET);
    print_diretamente_tela(fp,temporario3,temporario2);

}