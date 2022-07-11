package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {

	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 2;
		
		boolean acompanhado;
		if(quantidadePessoas > 1) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("acomapnhado:\t" + acompanhado);

	}
}
