package model;

public class CalcadoMenino extends Calcado {
    private String temaPersonagem; // Ex: Homem-Aranha, Carrinhos, Heróis

    public CalcadoMenino() {
        super();
    }

    public CalcadoMenino(String nome, String marca, int numeracao, double preco, String cor, String temaPersonagem) {
        super(nome, marca, numeracao, preco, cor);
        this.temaPersonagem = temaPersonagem;
    }

    public String getTemaPersonagem() { return temaPersonagem; }
    public void setTemaPersonagem(String temaPersonagem) { this.temaPersonagem = temaPersonagem; }

    @Override
    public String toString() {
        return super.toString() + " | Tema: " + temaPersonagem;
    }
}
