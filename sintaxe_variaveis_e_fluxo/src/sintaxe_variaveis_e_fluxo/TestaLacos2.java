package sintaxe_variaveis_e_fluxo;

public class TestaLacos2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					break;
				}
				System.out.print("*");
			}
			System.out.println("");
		}

//		for (int linha = 0; linha <= 10; linha++) {
//			for (int coluna = 0; coluna <= linha; coluna++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	}
}
