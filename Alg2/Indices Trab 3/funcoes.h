#ifndef FUNCOES
#define FUNCOES
#include<stdio.h>
#include<string.h>
#include<stdlib.h>

#define NAMESIZE 50
#define LASTNAMESIZE 50
#define COURSESIZE 50
#define REGSIZE (NAMESIZE+LASTNAMESIZE +COURSESIZE +sizeof(int)+sizeof(float))
#define NOMEARQUIVOPRINCIPAL "RegistroPrincipal.dat"
#define NOMEARQUIVOINDICE "RegistroIndice.dat"
#define TAMANHOINDICE (sizeof(int)+sizeof(int))

typedef struct _indice_reg{
    char ordem[10];//ordem
    char imput[REGSIZE];//pos ordem
}separador;

typedef struct _reg {
    int nUSP;
    char name[50];
    char lastname[50];
    char course[50];
    float grade;
}reg;

typedef struct _indice {
    int nUSP;
    int RRN;
}indice;

void print_data(reg *);

void print_diretamente_tela( FILE *,int );
int ler_do_teclado(char *,FILE *,FILE*);
separador *ler_e_separar(char *);
int gravar_no_arquivo(reg *, FILE *);
void gravar_no_indice(indice *,FILE*);
void setar_arquivo_ler_printar_tela(FILE *);
int encontrar_exibir(int ,FILE *, FILE *);
int ler_indice_retornar_rrn(int ,FILE *);
void deletarArquivo(int ,FILE*,FILE*);

#endif