package com.gpn.io;

import java.util.Scanner;

public class Entrada {
	private Scanner leitor;

	public Entrada() {
		leitor = new Scanner(System.in);
	}

	public double receberNumeroDouble() {
		double numero = leitor.nextDouble();
		return numero;
	}

	public int receberNumeroInteiro() {
		int numero = leitor.nextInt();
		return numero;
	}

	@Override
	protected void finalize() throws Throwable {
		leitor.close();
	}
}