package interfaces;

import modelo.Produto;

public interface InterfaceProduto {

    void cadastrarProduto(Produto produto);

    void listarProdutos();

    void removerProduto(int id, int quantidadeRemover);

}