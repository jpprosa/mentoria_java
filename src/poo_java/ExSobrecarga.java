package poo_java;

public class ExSobrecarga {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		int resultadoInteiro = calculadora.somar(5, 10);
		System.out.println("Resultado da soma inteira: " + resultadoInteiro);

		double resultadoDouble = calculadora.somar(3.5, 2.7);
		System.out.println("Resultado da soma de ponto flutuante: " + resultadoDouble);
	}
}

class Calculadora {
	int somar(int a, int b) {
		return a + b;
	}

	double somar(double a, double b) {
		return a + b;
	}
}