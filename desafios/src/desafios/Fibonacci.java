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
		for (int j = 0; j < 40; j++) {
			long valor = fib(j);
			if(valor == x) {
				v = true;
			}
		}
		if(v == true) {
			System.out.println("O numero: " + x + " pertence a sequencia de Fibonacci");
		}
		else {
			System.out.println("O numero: " + x + " NAO pertence a sequencia de Fibonacci");
		}
		
	}
	
	
}
