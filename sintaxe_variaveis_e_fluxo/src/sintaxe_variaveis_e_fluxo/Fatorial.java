package sintaxe_variaveis_e_fluxo;

public class Fatorial {
	public static void main(String[] args) {
		int n = 1, fatorial = n;

		for (int i = 1; i <= 10; i++) {
			fatorial = 1;

			for (int j = i; j > 1; j--) {
				fatorial *= j;
			}

			System.out.println("O fatorial de " + i + " eh " + fatorial + ".");
			
			
			

		}
		
	}

}
