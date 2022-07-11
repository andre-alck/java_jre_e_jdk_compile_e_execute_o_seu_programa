package sintaxe_variaveis_e_fluxo;

public class TestaLacos {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("\nTabuada do " + i);

			for (int j = 1; j <= 10; j++) {

				System.out.println(i + "*" + j + "\t=\t" + i * j);
			}
		}
	}
}
