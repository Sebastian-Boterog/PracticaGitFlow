package main.java.com.eam.app;

public class Calculadora {
	public static double sumar(double a, double b) {
		return a+b;
	}
	
	public static double restar(double a, double b) {
		return a-b;
	}
	
	
	public static double dividir(double a, double b) {
		if (b == 00) {
			throw new IllegalArgumentException("No se admiten divisores o");
		}

		return a / b;
	}
	
	public static double multiplicar(double a, double b) {
		return a*b;
	}
	
	
}
