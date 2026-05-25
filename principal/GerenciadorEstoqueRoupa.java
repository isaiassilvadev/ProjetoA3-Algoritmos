import javax.swing.JOptionPane;

public class GerenciadorEstoqueRoupa {
    public static void main(String[] args) {
        GerenciadorRoupas sistema = new GerenciadorRoupas();
        int opcao = 0;

        do {
            String menu = "--- SISTEMA LOJA DE ROUPAS ---\n"
                        + "1. Cadastrar Roupa Formal\n"
                        + "2. Pesquisar Roupa por ID\n"
                        + "3. Atualizar Preço da Roupa\n"
                        + "4. Remover Roupa do Estoque\n"
                        + "5. Sair\n\n"
                        + "Escolha uma opção:";
            
            String entrada = JOptionPane.showInputDialog(menu);
            if (entrada == null) break; 

            try {
                opcao = Integer.parseInt(entrada);

                switch (opcao) {
                    case 1: // Inserir [cite: 71]
                        String nome = JOptionPane.showInputDialog("Nome da peça (ex: Camisa Social):");
                        String marca = JOptionPane.showInputDialog("Marca:");
                        String tamanho = JOptionPane.showInputDialog("Tamanho (P/M/G):");
                        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço (R$):"));
                        String cor = JOptionPane.showInputDialog("Cor:");
                        String tecido = JOptionPane.showInputDialog("Tipo do Tecido (ex: Algodão):");

                        RoupaFormal novaRoupa = new RoupaFormal(nome, marca, tamanho, preco, cor, tecido);
                        sistema.inserir(novaRoupa);
                        
                        JOptionPane.showMessageDialog(null, "Roupa cadastrada! ID gerado automaticamente: " + novaRoupa.getId());
                        break;

                    case 2: // Pesquisar [cite: 72]
                        int idBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da roupa:"));
                        // Passa um objeto contendo apenas o ID para a pesquisa [cite: 43]
                        Roupa resultado = sistema.pesquisar(new Roupa(idBusca));

                        if (resultado != null) {
                            String info = "ID: " + resultado.getId() + "\n"
                                        + "Peça: " + resultado.getNome() + "\n"
                                        + "Tamanho: " + resultado.getTamanho() + "\n"
                                        + "Preço atual: R$ " + resultado.getPreco();
                            JOptionPane.showMessageDialog(null, info); // Visualização gráfica [cite: 74]
                        } else {
                            JOptionPane.showMessageDialog(null, "Roupa não encontrada.");
                        }
                        break;

                    case 3: // Atualizar [cite: 72]
                        int idAtu = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da roupa:"));
                        double novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço (R$):"));

                        if (sistema.atualizar(idAtu, novoPreco)) {
                            JOptionPane.showMessageDialog(null, "Preço atualizado com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "ID não encontrado.");
                        }
                        break;

                    case 4: // Remover [cite: 73]
                        int idRem = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da roupa para remover:"));
                        
                        if (sistema.remover(idRem)) {
                            JOptionPane.showMessageDialog(null, "Roupa removida do estoque.");
                        } else {
                            JOptionPane.showMessageDialog(null, "ID não encontrado.");
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Fechando o sistema da loja...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Digite um valor numérico válido.");
            }
        } while (opcao != 5);
    }
}
