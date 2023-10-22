package subsistema;

import java.util.List;
import java.util.ArrayList;

public class BancoDeDados {
	private static BancoDeDados instancia = new BancoDeDados();
	
	private List<String> clientes = new ArrayList<>();
	
	private BancoDeDados() {
		super();
	}
	
	public static BancoDeDados getInstancia() {
		return instancia;
	}
	
	public void adicionarCliente(String nome) {
		clientes.add(nome);
		System.out.println("cliente " + nome + " adicionado.");
	}
	
	public List listarClientes() {
		return this.clientes;
	}
}
