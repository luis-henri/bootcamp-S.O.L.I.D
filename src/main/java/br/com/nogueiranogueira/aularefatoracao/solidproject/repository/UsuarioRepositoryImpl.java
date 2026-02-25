package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Override
    public void salvar(Usuario usuario) {
        System.out.println("Salvando usuário no banco: " + usuario.getNome());
    }
}