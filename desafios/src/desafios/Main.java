package desafios;

public class Main {

	public static void main(String[] args) {
		System.out.println("Exercicio 2: ");
		Fibonacci fb = new Fibonacci();
		fb.compara(34);
		
		System.out.println("\n"+"Exercicio 3: ");
		faturamentoMensal f = new faturamentoMensal();
		f.menor();
		f.maior();
		f.supMedia();
		
		System.out.println("\n"+"Exercicio 4: ");
		FaturamentoEstadual fm = new FaturamentoEstadual();
		fm.representacao();
		
		System.out.println("\n"+"Exercicio 5: ");
		InverterString inv = new InverterString();
		inv.inverte();
	}
	

}
