package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {

		int idade = 18;
		int quantidadePessoas = 2;

		if (idade < 18) {
			if (quantidadePessoas > 1) {
				System.out.println("Menor de idade, mas acompanhado");
				System.out.println("Seja bem-vindo");
			} else {
				System.out.println("Infelizmente, voce nao pode entrar");
			}
		} else {
			if (quantidadePessoas > 1) {
				System.out.println("Maior de idade, nao permite acompanhante");
			} else {
				System.out.println("Maior de idade");
				System.out.println("Seja bem-vindo");
			}

		}

	}
}
