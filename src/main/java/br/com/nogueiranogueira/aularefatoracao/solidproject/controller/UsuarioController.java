package br.com.nogueiranogueira.aularefatoracao.solidproject.controller;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> criar(@RequestBody Usuario usuario) {
        usuarioService.criar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Usuário criado com sucesso");
    }
}