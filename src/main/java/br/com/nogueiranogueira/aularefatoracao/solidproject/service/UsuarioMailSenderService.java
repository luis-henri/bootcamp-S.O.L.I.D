package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioMailSenderService {

    public void enviarEmail(Usuario usuario) {
        System.out.println("Enviando email para: " + usuario.getEmail());
    }
}