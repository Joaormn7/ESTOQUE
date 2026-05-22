package servico;

import interfaces.InterfaceProduto;
import modelo.Produto;
import repositorio.ProdutoRepositorio;

public class ProdutoServico implements InterfaceProduto {

    ProdutoRepositorio repositorio = new ProdutoRepositorio();

    @Override
    public void cadastrarProduto(Produto produto) {
        repositorio.adicionarProduto(produto);
    }

    @Override
    public void listarProdutos() {

        if (repositorio.listarProdutos().isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto produto : repositorio.listarProdutos()) {
            System.out.println(produto);
        }

    }

    @Override
    public void removerProduto(int id, int quantidadeRemover) {
        repositorio.removerProduto(id, quantidadeRemover);
    }
}