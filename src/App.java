import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class App {
	
	public static void main(String[] args) {
		
		
		Cliente kaio = new Cliente();
		Cliente igor = new Cliente();
		
		kaio.setNome("Kaio");
		kaio.setCpf("123.456.789-10");
		igor.setNome("Kaio");
		igor.setCpf("987.654.321-01");
		
		Conta cc = new ContaCorrente(kaio);
		Conta poupanca = new ContaPoupanca(igor);

		cc.depositar(100);
		cc.transferir(80, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
