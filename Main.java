
public class Main {

	public static void main(String[] args) {
		Cliente Pablo = new Cliente();
		Pablo.setNome("Pablo");
		Conta cc = new ContaCorrente(Pablo);
		Conta poupanca = new ContaPoupanca(Pablo);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
