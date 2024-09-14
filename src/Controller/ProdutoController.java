package Controller;

import Model.dao.ProdutoDAOImpl;
import Model.dao.ProdutosDAO;
import Model.vo.Produto;
import View.ProdutoView;

import java.sql.SQLException;

public class ProdutoController {
    private ProdutosDAO dao;
    private ProdutoView view;

    public ProdutoController(ProdutosDAO dao, ProdutoView view) {
        this.dao = dao;
        this.view = view;
    }

    public void salvarProduto(Produto produto) throws SQLException {
        dao.inserir(produto);
        view.exibirMensagem("Produto cadastrado com sucesso");
    }




}
