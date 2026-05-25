public class RoupaFormal extends Roupa {
    private String tipoTecido; // Ex: Seda, Linho, Algodão

    public RoupaFormal() {
        super();
    }

    public RoupaFormal(String nome, String marca, String tamanho, double preco, String cor, String tipoTecido) {
        super(nome, marca, tamanho, preco, cor);
        this.tipoTecido = tipoTecido;
    }

    public String getTipoTecido() { return tipoTecido; }
    public void setTipoTecido(String tipoTecido) { this.tipoTecido = tipoTecido; }
}
