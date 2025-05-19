/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package POO;

// Classe base Produto
class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println(quantidade + "x " + nome + " - R$ " + (preco * quantidade));
    }

    public double getPrecoTotal() {
        return preco * quantidade;
    }
}

// Classe derivada Cafe
class Cafe extends Produto {
    protected String tamanho;

    public Cafe(String nome, double preco, String tamanho, int quantidade) {
        super(nome + " (" + tamanho + ")", preco, quantidade);
        this.tamanho = tamanho;
    }
}

// Classe derivada Doce
class Doce extends Produto {
    protected boolean temRecheio;

    public Doce(String nome, double preco, boolean temRecheio, int quantidade) {
        super(nome + " (" + (temRecheio ? "Com recheio" : "Sem recheio") + ")", preco, quantidade);
        this.temRecheio = temRecheio;
    }
}