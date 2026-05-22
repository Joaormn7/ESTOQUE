import fabrica.FabricaProduto;
import modelo.Produto;
import servico.ProdutoServico;
import util.Leitor;

public class Main {

    public static void main(String[] args) {

        ProdutoServico servico = new ProdutoServico();

        int opcao;

        do {

            System.out.println("\n=== STOCKFLOW ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Remover Quantidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = Leitor.scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("ID: ");
                    int id = Leitor.scanner.nextInt();

                    Leitor.scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = Leitor.scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = Leitor.scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = Leitor.scanner.nextInt();

                    Produto produto = FabricaProduto.criarProduto(id, nome, preco, quantidade);

                    servico.cadastrarProduto(produto);

                    System.out.println("Produto cadastrado com sucesso!");

                    break;

                case 2:

                    servico.listarProdutos();

                    break;

                case 3:

                    System.out.print("Digite o ID do produto: ");
                    int idRemover = Leitor.scanner.nextInt();

                    System.out.print("Digite a quantidade para remover: ");
                    int quantidadeRemover = Leitor.scanner.nextInt();

                    servico.removerProduto(idRemover, quantidadeRemover);

                    break;

                case 0:

                    System.out.println("Encerrando sistema...");
                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

    }
}