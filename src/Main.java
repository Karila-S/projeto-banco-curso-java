
public class Main {

	public static void main(String[] args) {
		Cliente karila = new Cliente();
		karila.setNome("Karila");
		
		Conta cc = new ContaCorrente(karila);
		Conta poupanca = new ContaPoupanca(karila);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
