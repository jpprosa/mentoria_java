package exception_java;

public class Program {
	public static void main(String[] args) {
		try {
			double result = divide(10, 0);
			System.out.println("Resultado da divisão: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Erro ao dividir: " + e.getMessage());
		}
	}

	public static double divide(double dividend, double divisor) throws ArithmeticException {
		if (divisor == 0) {
			throw new ArithmeticException("Divisor não pode ser zero!");
		}
		return dividend / divisor;
	}
}
