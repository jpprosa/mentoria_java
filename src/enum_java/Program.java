package enum_java;

public class Program {

	public static void main(String[] args) {
		for (DiaDaSemana dia : DiaDaSemana.values()) {
			System.out.printf("%s é um dia útil? %s%n", dia, dia.isDiaUtil() ? "Sim" : "Não");
		}
	}
}
