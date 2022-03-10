
public class Conta {

	private double saldo;
	 int agencia;
	 int numero;
	 Cliente titular;

	 
	public void exibeSaldo() {
		System.out.println("Seu saldo é " + this.saldo + " reais.");
	} 
	 
	public void deposita(double valor) {
		saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso, seu novo saldo é " + this.saldo);
			return true;
		}else {
			System.out.println("Não foi possível realizar o saque, seu saldo é de " + "R$ " + this.saldo + " Reais.");
			return false;
		}
		
	}

	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}

}
