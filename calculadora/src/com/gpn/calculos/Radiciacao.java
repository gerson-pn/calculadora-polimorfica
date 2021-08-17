package com.gpn.calculos;

public class Radiciacao extends Calculo {

	private Calculo potencia = new Potenciacao();

	@Override
	public double calcular(double indice, double radicando) {
		return potencia.calcular(radicando, (1.0 / indice));
	}

}
