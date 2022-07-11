package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.5;
		int valor = (int)salario;
		System.out.println("valor:\t" + valor);
		
		long numeroGrande = 9223372036854775807L;
		short numeroPequeno = 32767;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("total:\t" + total);
		
		//float pontoFlutuante = 3.14f;
	}
}
