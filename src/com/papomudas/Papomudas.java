package com.papomudas;

import java.util.Scanner;

import com.papomudas.utils.Mathes;

public class Papomudas {

	public static void main(String[] args) {

		int option;

		double numeroUno;
		double numeroDos;
		double numeroTres;
		double numeroCuatro;
		double numeroCinco;

		int valueUno;
		int valueDos;
		int valores;

		Scanner cin = new Scanner(System.in);
		Mathes mat = new Mathes();

		System.out.println("------------------------\n" 
				+ "MENU PAPOMUDAS\n" 
				+ "------------------------\n"
				+ "1. PARENTESIS (EJ. x = 4 + (5 * (2 - 2)) + 6\n" 
				+ "2. POTENCIAS (x**y)\n" 
				+ "3. MULTIPLICACION\n"
				+ "4. DIVISION\n" 
				+ "5. ADICION\n" 
				+ "6. SUSTRACCION AUTOMATICO (7,5,8,9)\n" 
				+ "Seleccione una opción:");
		option = cin.nextInt();
		System.out.println(); // salto de linea

		switch (option) {
			case 1:
				System.out.print("Ingrese primer valor: ");
				numeroUno = cin.nextDouble();
				System.out.print("Ingrese segundo valor: ");
				numeroDos = cin.nextDouble();
				System.out.print("Ingrese tercer valor: ");
				numeroTres = cin.nextDouble();
				System.out.print("Ingrese cuarto valor: ");
				numeroCuatro = cin.nextDouble();
				System.out.print("Ingrese quinto valor: ");
				numeroCinco = cin.nextDouble();
				
				System.out.println("\nEl resultado de la ecuación es: " + (int) mat.parentesis(numeroUno, numeroDos, 
						numeroTres, numeroCuatro, numeroCinco));
				break;
				
			case 2:
				System.out.print("Ingrese la base: ");
				numeroUno = cin.nextDouble();
				System.out.print("Ingrese el exponente: ");
				numeroDos = cin.nextDouble();
				
				System.out.println("\nEl resultado de la potencia es: " + (int) mat.potencia(numeroUno, numeroDos));
				break;
				
			case 3:
				System.out.print("Ingrese primer valor: ");
				valueUno = cin.nextInt();
				System.out.print("Ingrese segundo valor: ");
				valueDos = cin.nextInt();
				
				System.out.println("\nEl resultado de la multiplicacion es: " + mat.multiplicacion(valueUno, valueDos));
				break;
				
			case 4:
				System.out.print("Ingrese primer valor: ");
				numeroUno = cin.nextDouble();
				System.out.print("Ingrese segundo valor: ");
				numeroDos = cin.nextDouble();
				
				if (numeroDos == 0) {
					System.err.println("\nNo se puede dividir entre cero");
				} else {
					System.out.println("\nEl resultado de la division es: " + mat.division(numeroUno, numeroDos));
				}
				
				break;
				
			case 5:
				System.out.println("Ingrese n cantidad de numeros a sumar: (Ej. 56954)");
				valores = cin.nextInt();
				
				System.out.println("\nEl resultado de la suma es: " + mat.adicion(valores));
				break;
				
			case 6:
				System.out.println("\nEl resultado de la resta es: " + mat.sustraccion(7,5,8,9));
				break;
				
			default:
				System.out.println("!Opción no valida.");
		}
	}
}
