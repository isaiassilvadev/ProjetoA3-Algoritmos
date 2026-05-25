package model;

public class RoupaMasculina extends Roupa {
    private String tipoCorte; // Ex: Slim Fit, Regular, Extra Grande

    public RoupaMasculina() {
        super();
    }

    public RoupaMasculina(String nome, String marca, String tamanho, double preco, String cor, String tipoCorte) {
        super(nome, marca, tamanho, preco, cor);
        this.tipoCorte = tipoCorte;
    }

    public String getTipoCorte() { return tipoCorte; }
    public void setTipoCorte(String tipoCorte) { this.tipoCorte = tipoCorte; }
}
