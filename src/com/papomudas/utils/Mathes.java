package com.papomudas.utils;

public class Mathes {

	private double resultado;
	private int result = 0;

	public double parentesis(double n1, double n2, double n3, double n4, double n5) {
		resultado = n1 + (n2 * (n3 - n4) + n5);
		return resultado;
	}
	
	public double potencia(double n1, double n2) {
		resultado = Math.pow(n1, n2);
		return resultado;
	}
	
	public int multiplicacion(int n1, int n2) {
		result = n1 * n2;
		return result;
	}
	
	public double division(double n1, double n2) {
		resultado = n1 / n2;
		return resultado;
	}
	
	public int adicion(int numero) {
		int resto;
		int suma = 0;
		
		while (numero > 0) {
			resto = numero % 10;
			numero /= 10;
			suma += resto;
		}
		
		return suma;
	}
	
	public int sustraccion(int...values) {
		int acumResta = 0;
		
		for (int value : values) {
			acumResta -= value;
		}
		
		return acumResta;
	}
}
