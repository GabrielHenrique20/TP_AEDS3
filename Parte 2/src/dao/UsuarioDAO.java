package src.dao;

import src.model.Usuario;

public class UsuarioDAO {
    private ArquivoUsuario<Usuario> arqUsuario;

    public UsuarioDAO() throws Exception {
        arqUsuario = new ArquivoUsuario<>("Usuario", Usuario.class.getConstructor());
    }

    public Usuario buscarUsuario(int id) throws Exception {
        return arqUsuario.read(id);
    }

    public boolean incluirUsuario(Usuario usuario) throws Exception {
        return arqUsuario.create(usuario) > 0;
    }

    public boolean alterarUsuario(Usuario usuario) throws Exception {
        return arqUsuario.update(usuario);
    }

    public boolean excluirUsuario(int id) throws Exception {
        return arqUsuario.delete(id);
    }
}
