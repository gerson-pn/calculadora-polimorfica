package com.gpn.processos;

import com.gpn.calculos.Calculo;
import com.gpn.io.Entrada;

public abstract class Processo {
	Calculo calculo;
	Entrada leitor;

	public abstract void processar();
}

