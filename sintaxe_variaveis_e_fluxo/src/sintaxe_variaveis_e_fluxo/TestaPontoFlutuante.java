package sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario = 1250.70;
		System.out.println("salario:\tR$" + salario);
		System.out.printf("salario:\tR$%.3f", salario);
		
		double divisao = 3.14 / 2;
		System.out.println("\ndivisao:\t" + divisao);
		
		int outraDivisao = 5/2;
		System.out.println("outraDivisao:\t" + outraDivisao);
		
		double novaTentativa = 5.0/2;
		System.out.println("novaTentativa:\t" + novaTentativa);
	}
}
