
public class TestaBanco {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		cliente.nome = "Marcos Vinício";
		cliente.cpf = "222.222.222-22";
		cliente.profissao = "Programador";
		
		
		Conta contaDoMarcos = new Conta();
		contaDoMarcos.deposita(1000);
		
		contaDoMarcos.titular = cliente;
		
		System.out.println(contaDoMarcos.titular.nome);
		System.out.println(contaDoMarcos.titular);
		System.out.println(cliente);
		System.out.println(contaDoMarcos.titular);
	}

}
