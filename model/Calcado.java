package model;

public class Calcado {
    private static int contador = 1; // Controla o auto-incremento
    
    private int id;
    private String nome;
    private String marca;
    private int numeracao; // Ex: 37, 41, 22
    private double preco;
    private String cor;

    // Construtores
    public Calcado() {
    }

    public Calcado(String nome, String marca, int numeracao, double preco, String cor) {
        this.id = contador++; // Incrementa o ID automaticamente a cada novo calçado
        this.nome = nome;
        this.marca = marca;
        this.numeracao = numeracao;
        this.preco = preco;
        this.cor = cor;
    }

    public Calcado(int id) {
        this.id = id;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getNumeracao() { return numeracao; }
    public void setNumeracao(int numeracao) { this.numeracao = numeracao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    // toString no final para simplificar o Print
    @Override
    public String toString() {
        return "ID: " + id + 
               " | Calçado: " + nome + 
               " | Marca: " + marca + 
               " | Nº: " + numeracao + 
               " | Preço: R$ " + preco + 
               " | Cor: " + cor;
    }
}
