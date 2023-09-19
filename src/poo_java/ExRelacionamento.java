package poo_java;

import java.util.ArrayList;
import java.util.List;

public class ExRelacionamento {
	public static void main(String[] args) {
		Autor autor = new Autor("J.K. Rowling");
		Livro livro = new Livro("Harry Potter", autor);

		Biblioteca biblioteca = new Biblioteca();
		biblioteca.adicionarLivro(livro);

	}
}

//Associação
class Autor {
	private String nome;

	public Autor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}

//Agregação
class Livro {
	private String titulo;
	private Autor autor;

	public Livro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}
}

//Composição
class Biblioteca {
	private final List<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

	public void removerLivro(Livro livro) {
		livros.remove(livro);
	}
	
	public void limparBiblioteca() {
		livros.clear();
	}
}