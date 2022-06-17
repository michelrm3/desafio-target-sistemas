package desafios;

public class faturamentoMensal {

	private double[] valoresDiarios = {0, 1200, 600, 500, 550, 340, 910,
										0, 200, 700, 300, 950, 740, 810,
										0, 2200, 500, 700, 350, 640, 410,
										0, 569, 900, 800, 0, 770, 510};
	
	public void menor() {
		double menor = 1000;
		int i = 0;
		int dia = 0;
		for (double d : valoresDiarios) {
			i++;
			if(d != 0) {
				if(d < menor) {
					menor = d;
					dia = i;
				}
			}
		}
		System.out.println("O menor valor foi de: " + menor + ". No dia: " + dia);
	}
	
	public void maior() {
		double maior = 0;
		int i = 0;
		int dia = 0;
		for (double d : valoresDiarios) {
			i++;
			if(d != 0) {
				if(d > maior) {
					maior = d;
					dia = i;
				}
			}
		}
		System.out.println("O maior valor foi de: " + maior + ". No dia: " + dia);
	}
	
	public void supMedia() {
		int div = 0;
		double total = 0;
		for (double d : valoresDiarios) {
			if(d != 0) {
				div++;
				total += d;
			}
		}
		double media = total/div;
		int num = 0;
		for (double d : valoresDiarios) {
			if(d>media) {
				num++;
			}
		}
		System.out.println("Em " + num + " dias o valor de faturamento foi superior a media mensal");
	}
	
}
