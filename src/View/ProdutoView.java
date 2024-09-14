package View;

import Model.vo.Produto;

import java.util.List;

public interface ProdutoView {
    public void exibirMensagem(String mensagem);
    public void atualizarProdutos(List<Produto> produtos);
    public void exibirProduto(Produto produto);
}
