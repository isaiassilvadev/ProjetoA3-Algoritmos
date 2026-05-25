package model;

public class CalcadoFeminino extends Calcado {
    private String tipoSalto; // Ex: Salto Alto, Plataforma, Rasteiro

    public CalcadoFeminino() {
        super();
    }

    public CalcadoFeminino(String nome, String marca, int numeracao, double preco, String cor, String tipoSalto) {
        super(nome, marca, numeracao, preco, cor);
        this.tipoSalto = tipoSalto;
    }

    public String getTipoSalto() { return tipoSalto; }
    public void setTipoSalto(String tipoSalto) { this.tipoSalto = tipoSalto; }

    @Override
    public String toString() {
        return super.toString() + " | Salto: " + tipoSalto;
    }
}
