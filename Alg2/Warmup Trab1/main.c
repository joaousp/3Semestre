#include<string.h>
#include<stdio.h>
#include<stdlib.h>

#define NAMESIZE 50
#define COURSESIZE 50
#define REGSIZE (NAMESIZE +COURSESIZE +sizeof(int)+sizeof(float))

//struct definida na monitoria

typedef struct reg {
    int nUSP;
    char name[50];
    char course[50];
    float grade;
} reg;

//espaco para definir as funcoes
void print_data(reg *);
void print_d(reg *, FILE *,int comeco, int fim);

//lembrar de perguntar sobre argc argv[], pois deu erro no vscode windows
int main(){
    
    //declaracao de variaveis
    reg *data=(reg*)calloc(1,sizeof(reg));
    FILE *fp;
    char endereco[40];//onde o programa vai armazenar o nome do .dat
    int operacao;
    int t1,t2;
    int comeco, fim;
    //int valor1; //usado para iniciar a faixa ou para encontrar registro expecifico 
    //int valor2; //usado para fechar a faixa

    //abrir o arquivo binario e fazer teste se deu certo
    scanf("%s", endereco);
    fp = fopen(endereco,"rb");
    if( fp == NULL )  {
      printf ("Error opening file");
      return(-1);
    }
    fseek(fp,0,SEEK_END);
    comeco=0;
    //para saber quantas posicoes devem ser lidas
    t1=ftell(fp);
    t2=t1/REGSIZE;
    
    fseek(fp,0,SEEK_SET);
    //5 operacoes possiveis
    scanf("%d", &operacao);
    switch (operacao)
    {
        //exibir todos
        case 1:
            comeco=0;
            fim=t2;
            print_d(data,fp,comeco, fim);
        break;
    
        //exibir metade, comeco ao meio    
        case 2:
            comeco=0;
            fim=t2;
            print_d(data,fp,comeco,(comeco+fim)/2);
        break;
        
        //exibir metade, meio ao fim    
        case 3:
            comeco=0;
            fim=t2;
            print_d(data,fp,(comeco+fim)/2,fim);
        break;

        //exibir faixa expecifica    
        case 4:
            scanf("%d",&comeco);
            scanf("%d",&fim);
            if(fim>=t2)fim=t2;
            print_d(data,fp, comeco-1, fim);
        break;

        //exibir registro expecifico
        case 5:
            scanf("%d", &comeco);
            print_d(data,fp, comeco-1,comeco);
        
    }
    free(data);
    fclose(fp);
    return 0;
}

void print_d(reg *data, FILE *fp,int comeco, int fim){
    if(comeco>0){
        //preciso usar fseek
        fseek(fp,REGSIZE*comeco,SEEK_SET);
    }

    while(comeco<fim){
        fread(&data->nUSP,sizeof(int),1, fp);
        fread(&data->name,50,1, fp);
        fread(&data->course,50,1, fp);
        fread(&data->grade,sizeof(float),1, fp);
        print_data(data);
        comeco++;
        if(comeco+1<=fim)printf("\n");
    }
}

void print_data(reg *data){
    printf("nUSP: %d\n",data->nUSP);
    printf("Nome: %s\n",data->name);
    printf("Curso: %s\n",data->course);
    printf("Nota: %.2f\n",data->grade);
}