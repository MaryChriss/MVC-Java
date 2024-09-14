package View;

import Model.vo.Produto;

import java.util.List;

public class ProdutoViewIMPL implements  ProdutoView{
    @Override
    public void exibirMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }

    @Override
    public void atualizarProdutos(List<Produto> produtos) {
        System.out.println("--- Lista de produtos ---");
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto);
        }
    }

    @Override
    public void exibirProduto(Produto produto) {
        System.out.println("Produto: " + produto);
    }
}
