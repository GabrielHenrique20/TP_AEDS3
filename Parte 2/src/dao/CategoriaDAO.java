package src.dao;

import src.model.Categoria;

public class CategoriaDAO {
    private ArquivoCategoria<Categoria> arqCategoria;

    public CategoriaDAO() throws Exception {
        arqCategoria = new ArquivoCategoria<>("Categoria", Categoria.class.getConstructor());
    }

    public Categoria buscarCategoria(int id) throws Exception {
        return arqCategoria.read(id);
    }

    public boolean incluirCategoria(Categoria categoria) throws Exception {
        return arqCategoria.create(categoria) > 0;
    }

    public boolean alterarCategoria(Categoria categoria) throws Exception {
        return arqCategoria.update(categoria);
    }

    public boolean excluirCategoria(int id) throws Exception {
        return arqCategoria.delete(id);
    }
}
