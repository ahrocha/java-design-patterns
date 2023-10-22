package dev.andreyrocha.gof;

import dev.andreyrocha.gof.strategy.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento normal = new ComportamentoNormal();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
	}

}
