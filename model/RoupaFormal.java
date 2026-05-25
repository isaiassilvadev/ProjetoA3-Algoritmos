package model;

public class RoupaFormal extends Roupa {
    private String tipoTecido;

    public RoupaFormal() {
        super();
    }

    public RoupaFormal(String nome, String marca, String tamanho, double preco, String cor, String tipoTecido) {
        super(nome, marca, tamanho, preco, cor);
        this.tipoTecido = tipoTecido;
    }

    public String getTipoTecido() { return tipoTecido; }
    public void setTipoTecido(String tipoTecido) { this.tipoTecido = tipoTecido; }

    @Override
    public String toString() {
        return super.toString() + " | Tecido: " + tipoTecido;
    }
}
