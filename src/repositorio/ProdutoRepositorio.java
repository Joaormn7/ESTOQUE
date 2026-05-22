package repositorio;

import modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorio {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public void removerProduto(int id, int quantidadeRemover) {

        Produto produtoEncontrado = null;

        for (Produto produto : produtos) {

            if (produto.getId() == id) {
                produtoEncontrado = produto;
                break;
            }

        }

        if (produtoEncontrado == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        if (quantidadeRemover <= 0) {
            System.out.println("Quantidade inválida!");
            return;
        }

        if (quantidadeRemover > produtoEncontrado.getQuantidade()) {
            System.out.println("Quantidade maior que o estoque disponível!");
            return;
        }

        produtoEncontrado.setQuantidade(
                produtoEncontrado.getQuantidade() - quantidadeRemover
        );

        if (produtoEncontrado.getQuantidade() == 0) {

            produtos.remove(produtoEncontrado);

            System.out.println("Produto zerado e removido do estoque!");

        } else {

            System.out.println("Quantidade removida com sucesso!");

        }

    }
}