package poo;

public class ExPolimorfismo {

	public static void main(String[] args) {

		Animal animal1 = new Cachorro();
		Animal animal2 = new Gato();

		animal1.fazerBarulho();
		animal2.fazerBarulho();
	}

}

class Animal {
	void fazerBarulho() {
		System.out.println("O animal faz um barulho.");
	}
}

class Cachorro extends Animal {
	@Override
	void fazerBarulho() {
		System.out.println("O cachorro late: Au au!");
	}
}

class Gato extends Animal {
	@Override
	void fazerBarulho() {
		System.out.println("O gato mia: Miau!");
	}
}