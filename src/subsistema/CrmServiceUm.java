package subsistema;

import java.util.List;

public class CrmServiceUm {

		public static void gravarCliente(String nome) {
			BancoDeDados bancoDeDados = BancoDeDados.getInstancia();
			bancoDeDados.adicionarCliente(nome);			
		}

		public static void enviarPara(String local) {
			System.out.println("Enviado para " + local);
		}

		public static List<String> clientes() {
			BancoDeDados bancoDeDados = BancoDeDados.getInstancia();
			return bancoDeDados.listarClientes();
		}
}
