package model;

public class CalcadoMenina extends Calcado {
    private String detalheEnfeite; // Ex: Glitter, Laço, Luzinha LED

    public CalcadoMenina() {
        super();
    }

    public CalcadoMenina(String nome, String marca, int numeracao, double preco, String cor, String detalheEnfeite) {
        super(nome, marca, numeracao, preco, cor);
        this.detalheEnfeite = detalheEnfeite;
    }

    public String getDetalheEnfeite() { return detalheEnfeite; }
    public void setDetalheEnfeite(String detalheEnfeite) { this.detalheEnfeite = detalheEnfeite; }

    @Override
    public String toString() {
        return super.toString() + " | Detalhe: " + detalheEnfeite;
    }
}
