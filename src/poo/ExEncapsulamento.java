package poo;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class ExEncapsulamento {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");

        System.out.println("Nome: " + pessoa.getNome());

        pessoa.setNome("Maria");
        System.out.println("Novo nome: " + pessoa.getNome());
    }
}

