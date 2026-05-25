package view;

// IMPORT COM ASTERISCO: Traz tudo o que estiver dentro da pasta model de uma só vez!
import model.*;

public class SistemaLojaRoupas {
    public static void main(String[] args) {
        
        System.out.println("--- 1. INSTANCIANDO AS 4 CLASSES FILHAS ---");
        
        RoupaFormal terno = new RoupaFormal("Terno Slim", "Zara", "G", 799.90, "Preto", "Seda");
        RoupaFeminina vestido = new RoupaFeminina("Vestido Florido", "Farm", "M", 250.00, "Azul", "Vestido Longo");
        RoupaMasculina bermuda = new RoupaMasculina("Bermuda Cargo", "Hering", "42", 120.00, "Verde", "Regular");
        RoupaInfantil casaco = new RoupaInfantil("Casaco Ursinho", "Carter's", "G", 150.00, "Rosa", "6-9 meses");

        // Exibindo o estado inicial de todos usando o toString()
        System.out.println(terno);
        System.out.println(vestido);
        System.out.println(bermuda);
        System.out.println(casaco);

        System.out.println("\n--- 2. ALTERANDO DADOS COM OS SETTERS ---");
        
        // Aplicando setters herdados da classe pai (Preço, Tamanho, Cor)
        terno.setPreco(699.00);      // Desconto no terno
        vestido.setTamanho("P");     // Mudando tamanho do vestido
        bermuda.setCor("Preta");     // Trocando a cor da bermuda
        
        // Aplicando setter exclusivo da classe filha Infantil
        casaco.setFaixaEtaria("1ano"); // Ajustando a idade recomendada do casaco

        System.out.println("\n--- 3. EXIBINDO DADOS ATUALIZADOS (TOSTRING) ---");
        
        System.out.println(terno);
        System.out.println(vestido);
        System.out.println(bermuda);
        System.out.println(casaco);
    }
}
