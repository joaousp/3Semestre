all: main
main: main.o funcoes.o
	gcc -o main main.o funcoes.o
main.o: main.c funcoes.h
	gcc -c main.c -o main.o
funcoes.o: funcoes.c funcoes.h
	gcc -c funcoes.c -o funcoes.o
run: main
	./main
clean:
	rm -f *.o *~ main