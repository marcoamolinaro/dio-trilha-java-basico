package com.dio.tipovariaveis;

public class TipoVariaveis {

	public static void main(String[] args) {
		
		double salarioMinimo = 2500;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		int numero = 5;
		
		numero = 10;
		
		System.out.println("Valor: " + numero);
		
		final double VALOR_DE_PI = 3.14;
		
		System.out.println("Valor de PI:" + VALOR_DE_PI);
	}

}
