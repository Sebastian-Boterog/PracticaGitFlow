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
	
	public static double raizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        return Math.sqrt(a);
    }

	public static int factorial(int a) {
		if (a < 1) {
			throw new IllegalArgumentException("El número debe ser no negativo");
		}
		int valor = 1;
		for (int i = a; i >= 1; i--) {
			valor = valor * i;
		}
		return valor;
	}
}
