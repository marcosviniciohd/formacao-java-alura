import java.util.Locale;
import java.util.Scanner;

public class TestaMetodo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		Conta contaDestino = new Conta();
		
		System.out.println("Digite o valor que deseja depositar em sua conta.");
		double valorDoDeposito = sc.nextDouble();
		
		conta.deposita(valorDoDeposito);
		
		System.out.printf("Deposito realizado com sucesso, seu novo saldo é %.2f reais.",  conta.saldo);
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		
		
		System.out.println("Digite o valor que deseja transferir para a conta de destino");
		double valorDaTransferencia = sc.nextDouble();
		conta.transfere(valorDaTransferencia, contaDestino);
		System.out.printf("Seu saldo após a transferencia é %.2f reais", conta.saldo);
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		
		
		
		
		sc.close();
	}

}
