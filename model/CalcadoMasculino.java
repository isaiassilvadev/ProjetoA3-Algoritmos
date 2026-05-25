package model;

public class CalcadoMasculino extends Calcado {
    private String tipoUso; // Ex: Social, Esportivo, Casual

    public CalcadoMasculino() {
        super();
    }

    public CalcadoMasculino(String nome, String marca, int numeracao, double preco, String cor, String tipoUso) {
        super(nome, marca, numeracao, preco, cor);
        this.tipoUso = tipoUso;
    }

    public String getTipoUso() { return tipoUso; }
    public void setTipoUso(String tipoUso) { this.tipoUso = tipoUso; }

    @Override
    public String toString() {
        return super.toString() + " | Estilo: " + tipoUso;
    }
}
