package com.gpn.processos;

import com.gpn.calculos.Subtracao;
import com.gpn.io.Entrada;

public class ProcessoSubtracao extends Processo {
	@Override
	public void processar() {
		System.out.println("Digite o primeiro numero para subtrair:");
		leitor = new Entrada();
		double numero1 = leitor.receberNumeroDouble();
		System.out.println("Digite o segundo numero para subtrair:");
		leitor = new Entrada();
		double numero2 = leitor.receberNumeroDouble();
		calculo = new Subtracao();
		double resultado = calculo.calcular(numero1, numero2);
		System.out.println("\nResultado: " + resultado + "\n");
	}

}
