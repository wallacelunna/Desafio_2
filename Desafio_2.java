package Extra;

import java.util.Scanner;

public class Desafio_2 {

	private static int[] vetAux = new int[50];
    private static int k;

    public static long fibo(int n) {
             k = 1; // inicializa k
             return recursao(n);
           }

    private static long recursao(int n) {
            if (n < 0) {
               return vetAux[0];
          } else {
           if (k < 3) {
              vetAux[n] = k - 1;
              k++;
           } else {
                 vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
                 }
              return recursao(n - 1);
           }
    }

    public static void main(String[] args) {  // teste do programa. Imprime os 30 primeiros termos
    	Scanner fib = new Scanner(System.in);
    	int qtd;
    	System.out.println ("Informe até quanto será calculado:");
		qtd = fib.nextInt();
    	for (int i = 0; i < qtd; i++) {
        System.out.print("(" + i + "):" + Desafio_2.fibo(i) + "\n");
        }
    }
}
	
	