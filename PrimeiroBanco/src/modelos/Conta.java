package modelos;

	public class Conta {
		float saldo;
		String conta;

	public Conta (String conta) {
		saldo =0;
		this.conta = conta;
	}
	
	public void depositar (float deposito) {

		saldo += deposito;	
	}
	
	public void sacar (float sacar) {
		if (sacar > saldo) {
			System.out.println("Saldo Insuficiente");
		}
		else {
			saldo -= sacar;
		}
	}
	
	public String toString() {
		return "Saldo" + saldo;
	}
}
