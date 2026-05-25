public class Roupa {
    private static int contador = 1; // Controla o auto-incremento global [cite: 30, 66]
    
    private int id; // ID obrigatório do tipo int [cite: 29]
    private String nome;
    private String marca;
    private String tamanho; // Ex: P, M, G
    private double preco;
    private String cor;

    // Construtor padrão [cite: 33]
    public Roupa() {
    }

    // Construtor com todos os atributos, EXCETO o id [cite: 34]
    public Roupa(String nome, String marca, String tamanho, double preco, String cor) {
        this.id = contador++; // Incrementa automaticamente iniciando de 1 [cite: 30, 66]
        this.nome = nome;
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
        this.cor = cor;
    }

    // Construtor adicional apenas com ID (para pesquisa) [cite: 35, 36]
    public Roupa(int id) {
        this.id = id;
    }

    // Getters e Setters para todos os atributos [cite: 32]
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
}
