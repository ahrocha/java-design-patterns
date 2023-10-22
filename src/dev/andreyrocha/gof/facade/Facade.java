package dev.andreyrocha.gof.facade;

import java.util.List;

import subsistema.CrmServiceUm;

public class Facade {

		public void criarCliente(String nome, String cidade) {
			
			CrmServiceUm.gravarCliente(nome);
			CrmServiceUm.enviarPara(cidade);

		}
}
