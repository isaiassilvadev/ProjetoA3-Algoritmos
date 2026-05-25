package model; // Mesma pasta das outras roupas

public class RoupaFeminina extends Roupa {
    private String categoriaFeminina; // Ex: Vestido, Saia, Calça, Blusa

    public RoupaFeminina() {
        super();
    }

    public RoupaFeminina(String nome, String marca, String tamanho, double preco, String cor, String categoriaFeminina) {
        super(nome, marca, tamanho, preco, cor); // Envia os dados para a classe pai
        this.categoriaFeminina = categoriaFeminina;
    }

    public String getCategoriaFeminina() { return categoriaFeminina; }
    public void setCategoriaFeminina(String categoriaFeminina) { this.categoriaFeminina = categoriaFeminina; }
}
