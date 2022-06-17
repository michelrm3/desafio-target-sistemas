package desafios;

public class InverterString {
	private String string = "saopaulo";
	
	public void inverte() {
		char vet[] = string.toCharArray();
		char vetInv[] = new char[vet.length]; 
		for (int i = vet.length-1, j = 0; i >= 0 && j < vet.length; i--, j++){
			vetInv[j] = vet[i]; 
		}
		System.out.print("Palavra invertida: ");
		for (char c : vetInv) {
			System.out.print(c);
		}
	}

}
