
public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da primeira conta: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("É a mesma referencia para o objeto do tipo conta.");
		}
		
		
		
		
	}

}
