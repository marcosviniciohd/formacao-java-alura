
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		//primeiraConta.saldo = 200;
		
		/*
		 * System.out.println(primeiraConta.saldo);
		 * System.out.println(primeiraConta.numero);
		 * System.out.println(primeiraConta.titular);
		 */
		
		Conta segundaConta = new Conta();
		
		if (primeiraConta == segundaConta) {
			System.out.println("Referencias iguais");
		}else {
			System.out.println("Referencias diferentes");
		}
		
	}

}
