#include<stdio.h>
#include<string.h>
#include<stdlib.h>

#define NAMESIZE 50
#define COURSESIZE 50
#define REGSIZE (NAMESIZE +COURSESIZE +sizeof(int)+sizeof(float))
#define NOMEARQUIVO "Registros.dat"

typedef struct _reg reg;
void print_data(reg *);
void print_diretamente_tela( FILE *,int comeco, int fim);
reg *ler_do_teclado(char *);
void gravar_no_arquivo(reg *, FILE *);
void setar_arquivo_ler(FILE *);