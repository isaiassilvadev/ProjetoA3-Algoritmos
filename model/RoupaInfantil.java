package model;

public class RoupaInfantil extends Roupa {
    private String faixaEtaria; // Ex: 0-3 meses, 2-4 anos, 6-8 anos

    public RoupaInfantil() {
        super();
    }

    public RoupaInfantil(String nome, String marca, String tamanho, double preco, String cor, String faixaEtaria) {
        super(nome, marca, tamanho, preco, cor);
        this.faixaEtaria = faixaEtaria;
    }

    public String getFaixaEtaria() { return faixaEtaria; }
    public void setFaixaEtaria(String faixaEtaria) { this.faixaEtaria = faixaEtaria; }
}
