package Model.dao;

import Model.vo.Produto;

import java.sql.SQLException;
import java.util.List;

public interface ProdutosDAO {

    public void inserir(Produto produto) throws SQLException;
    public List<Produto> listar() throws SQLException;
    public Produto buscarId(int id) throws SQLException;
    public void atualizar(Produto produto) throws SQLException;
    public void deletar(int id) throws SQLException;
}
