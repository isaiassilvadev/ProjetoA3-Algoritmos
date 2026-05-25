package principal;

import model.*;

public class SistemaLojaVestuario {
    public static void main(String[] args) {
        
        System.out.println("====== ESTADO INICIAL DO ESTOQUE ======");
        
        // --- Instanciando as Roupas que você já tinha ---
        RoupaFormal terno = new RoupaFormal("Terno Slim", "Zara", "G", 799.90, "Preto", "Seda");
        RoupaFeminina vestido = new RoupaFeminina("Vestido Florido", "Farm", "M", 250.00, "Azul", "Vestido Longo");
        RoupaMasculina bermuda = new RoupaMasculina("Bermuda Cargo", "Hering", "42", 120.00, "Verde", "Regular");
        RoupaInfantil casaco = new RoupaInfantil("Casaco Ursinho", "Carter's", "G", 150.00, "Rosa", "6-9 meses");

        // --- Instanciando os novos Calçados ---
        CalcadoMasculino sapato = new CalcadoMasculino("Sapato Derby", "Anatomic Gel", 41, 389.90, "Café", "Social");
        CalcadoFeminino sandalia = new CalcadoFeminino("Sandália Bloco", "Arezzo", 37, 249.90, "Nude", "Salto Médio");
        CalcadoMenino tenisBoy = new CalcadoMenino("Tênis Rodinha", "Ortopé", 28, 159.90, "Azul", "Heróis");
        CalcadoMenina sapatilhaGirl = new CalcadoMenina("Sapatilha", "Molekinha", 24, 89.90, "Rosa", "Laço Cetim");

        // Mostrando todos na tela usando o toString() automático do Java
        System.out.println(terno);
        System.out.println(vestido);
        System.out.println(bermuda);
        System.out.println(casaco);
        System.out.println(sapato);
        System.out.println(sandalia);
        System.out.println(tenisBoy);
        System.out.println(sapatilhaGirl);

        System.out.println("\n====== MODIFICANDO DADOS (SETTERS) ======");
        
        // Mudando dados das Roupas com setters
        terno.setPreco(699.00);
        vestido.setTamanho("P");
        
        // Mudando dados dos Calçados com setters
        sapato.setPreco(349.00);
        sandalia.setNumeracao(36);

        System.out.println("\n====== ESTOQUE ATUALIZADO (TOSTRING) ======");
        
        System.out.println(terno);
        System.out.println(vestido);
        System.out.println(sapato);
        System.out.println(sandalia);
    }
}
