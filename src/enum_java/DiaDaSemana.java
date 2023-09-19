package enum_java;

public enum DiaDaSemana {

	DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;

	public boolean isDiaUtil() {
		switch (this) {
		case DOMINGO:
		case SABADO:
			return false;
		default:
			return true;
		}
	}
}
