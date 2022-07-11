package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {

	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas > 1;

		if ((idade >= 18 && !acompanhado) || (idade < 18 && acompanhado))
			System.out.println("Seja bem-vindo");
		else
			System.out.println("Infelizmente, voce nao pode entrar");

	}
}
