package dev.andreyrocha.gof.facade;

import java.util.List;

import subsistema.CrmServiceUm;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade();
		facade.criarCliente("Paulo", "Sao Paulo");
		facade.criarCliente("Luiz", "Sao Luiz");
		
		List<String> clientes = CrmServiceUm.clientes();
		System.out.println("Total de clientes: " + clientes.size());
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));
		}
	}

}
