
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(1000);
		conta.exibeSaldo();
		
		conta.titular = new Cliente();
		conta.titular.nome = "Marcos Vinício";
		System.out.println(conta.titular.nome);
		
	}

}
