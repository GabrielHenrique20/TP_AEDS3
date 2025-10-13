package src.dao;

import src.model.Atividade;

public class AtividadeDAO {
    private ArquivoAtividade<Atividade> arqAtividade;

    public AtividadeDAO() throws Exception {
        arqAtividade = new ArquivoAtividade<>("Atividade", Atividade.class.getConstructor());
    }

    public Atividade buscarAtividade(int id) throws Exception {
        return arqAtividade.read(id);
    }

    public boolean incluirAtividade(Atividade atividade) throws Exception {
        return arqAtividade.create(atividade) > 0;
    }

    public boolean alterarAtividade(Atividade atividade) throws Exception {
        return arqAtividade.update(atividade);
    }

    public boolean excluirAtividade(int id) throws Exception {
        return arqAtividade.delete(id);
    }
}
