package sintaxe_variaveis_e_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
		
		int um = 1;
		String frase = "Concatenando uma String com " + um + " Inteiro.";
		System.out.println(frase); // Compilando uma String com 1 Inteiro.
	}
}
