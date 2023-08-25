package poo;

public class ExHeranca {
	public static void main(String[] args) {
		Ave ave = new Ave();
		Pato pato = new Pato();

		ave.fazerBarulho();
		pato.fazerBarulho();
	}
}

class Ave {
	void fazerBarulho() {
		System.out.println("A ave está fazendo barulho.");
	}
}

class Pato extends Animal {
	void fazerBarulho() {
		System.out.println("O pato está cantando.");
	}
}