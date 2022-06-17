package desafios;

public class Fibonacci {
	private static int[] vetorAuxiliar = new int[50];
	private static int n;
	
	
	
	
	public static long recursividade(int i) {
		if(i < 0) {
			return vetorAuxiliar[0];
		}
		else {
			if(n < 3) {
				vetorAuxiliar[i] = n - 1;
				n++;
			}
			else {
				vetorAuxiliar[i] = vetorAuxiliar[i+1] + vetorAuxiliar[i+2];
			}
			return recursividade(i - 1);
		}
	}
	public static long fib(int i) {
		n = 1;
		return recursividade(i);
	}
	
	public void compara(int x) {
		Boolean v = false;
		int j = 0;
		int i = 0;
		do{
			long valor = fib(j);
			if(valor == x) {
				v = true;
				i = 1;
			}
			if(valor>x) {
				i = 1;
			}
			j++;
		}while (i != 1);
		
		if(v == true) {
			System.out.println("O numero: " + x + " pertence a sequencia de Fibonacci");
		}
		else {
			System.out.println("O numero: " + x + " NAO pertence a sequencia de Fibonacci");
		}
		
	}
	
	
}
