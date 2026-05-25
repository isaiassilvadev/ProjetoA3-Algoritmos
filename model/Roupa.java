package model;

public class Roupa {
    private static int contador = 1;
    
    private int id;
    private String nome;
    private String marca;
    private String tamanho;
    private double preco;
    private String cor;

    // Construtores
    public Roupa() {
    }

    public Roupa(String nome, String marca, String tamanho, double preco, String cor) {
        this.id = contador++;
        this.nome = nome;
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
        this.cor = cor;
    }

    public Roupa(int id) {
        this.id = id;
    }

    // Getters e Setters completos
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    // toString no final para simplificar a exibição
    @Override
    public String toString() {
        return "ID: " + id + 
               " | Peça: " + nome + 
               " | Marca: " + marca + 
               " | Tam: " + tamanho + 
               " | Preço: R$ " + preco + 
               " | Cor: " + cor;
    }
}
