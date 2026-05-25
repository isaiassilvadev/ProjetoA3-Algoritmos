package model;

public class RoupaFeminina extends Roupa {
    private String categoriaFeminina;

    // Construtores
    public RoupaFeminina() {
        super();
    }

    public RoupaFeminina(String nome, String marca, String tamanho, double preco, String cor, String categoriaFeminina) {
        super(nome, marca, tamanho, preco, cor);
        this.categoriaFeminina = categoriaFeminina;
    }

    // Getter e Setter específico
    public String getCategoriaFeminina() { return categoriaFeminina; }
    public void setCategoriaFeminina(String categoriaFeminina) { this.categoriaFeminina = categoriaFeminina; }

    // toString no final reaproveitando o super.toString()
    @Override
    public String toString() {
        return super.toString() + " | Categoria: " + categoriaFeminina;
    }
}
