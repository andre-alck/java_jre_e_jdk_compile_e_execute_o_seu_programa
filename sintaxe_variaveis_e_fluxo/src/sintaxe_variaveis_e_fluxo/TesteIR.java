package sintaxe_variaveis_e_fluxo;

public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;
        int impostoDeRenda = 0;

        if (salario >= 1900 && salario <= 2800) {
            impostoDeRenda = 142;
        }
        else if(salario >= 2800.01 && salario <= 3751.0) {
            impostoDeRenda = 142;
        }
        else if(salario >= 3751.1 && salario <= 4664.00) {
            impostoDeRenda = 142;
        }
        
        salario = salario - impostoDeRenda;
        System.out.println("salario:\t" + salario);
        
    }
}