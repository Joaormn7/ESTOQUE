package fabrica;

import modelo.Produto;

public class FabricaProduto {

    public static Produto criarProduto(int id, String nome, double preco, int quantidade) {

        return new Produto(id, nome, preco, quantidade);

    }

}