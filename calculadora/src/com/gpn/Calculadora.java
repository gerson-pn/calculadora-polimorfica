package com.gpn;

import com.gpn.io.Entrada;
import com.gpn.processos.Processo;
import com.gpn.processos.ProcessoSoma;
import com.gpn.processos.ProcessoSubtracao;

public class Calculadora {
	public static void main(String[] args) {
		boolean execucao = true;
		Processo processo;

		while (execucao) {
			System.out.println("Que tipo de opera��o voc� deseja fazer:");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Divis�o");
			System.out.println("4 - Potencia��o");
			System.out.println("5 - Radicia��o");
			System.out.println("6 - Formula de bhaskara");
			System.out.println("0 - Finalizar a calculadora");

			Entrada leitor = new Entrada();
			int operacao = leitor.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("At� mais!\n");
				break;
			case 1:
				processo = new ProcessoSoma();
				processo.processar();
				break;
			case 2:
				processo = new ProcessoSubtracao();
				processo.processar();
				break;
			}

		}
	}
}

