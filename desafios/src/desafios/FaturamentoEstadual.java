package desafios;

public class FaturamentoEstadual {
	private double sp = 67836.43;
	private double rj = 36678.66;
	private double mg = 29229.88;
	private double es = 27165.48;
	private double out = 19849.53;
	
	public void representacao() {
		double total = sp + rj + mg + es + out;
		System.out.println("Percentual de representacao de SP: " + (sp*100)/total  + " %");
		System.out.println("Percentual de representacao de RJ: " + (rj*100)/total  + " %");
		System.out.println("Percentual de representacao de MG: " + (mg*100)/total  + " %");
		System.out.println("Percentual de representacao de ES: " + (es*100)/total  + " %");
		System.out.println("Percentual de representacao de Outros: " + (out*100)/total  + " %");
	}

}
