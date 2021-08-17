package com.gpn.calculos;

public class Potenciacao extends Calculo {
	@Override
	public double calcular(double base, double expoente) {
		return Math.pow(base, expoente);
	}
}

