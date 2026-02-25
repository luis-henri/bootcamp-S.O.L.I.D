package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private DescontoService descontoService;

    @Autowired
    private UsuarioMailSenderService emailService;

    public void criar(Usuario usuario) {

        validarUsuario(usuario);

        descontoService.aplicarDesconto(usuario);

        repository.salvar(usuario);

        emailService.enviarEmail(usuario);
    }

    private void validarUsuario(Usuario usuario) {
        if (usuario.getNome() == null || usuario.getNome().isBlank()) {
            throw new RuntimeException("Nome é obrigatório");
        }

        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            throw new RuntimeException("Email inválido");
        }
    }
}