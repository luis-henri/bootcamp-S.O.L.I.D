package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.UsuarioVIP;
import org.springframework.stereotype.Service;

@Service
public class DescontoService {

    public void aplicarDesconto(Usuario usuario) {

        if (usuario instanceof UsuarioVIP) {
            usuario.setDesconto(20.0);
        } else {
            usuario.setDesconto(5.0);
        }
    }
}