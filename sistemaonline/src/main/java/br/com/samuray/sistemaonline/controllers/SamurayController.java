package br.com.samuray.sistemaonline.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamurayController {

    @RequestMapping("/nome")
    public ResponseEntity<String> getNome() {
        return ResponseEntity.ok("Rodrigo");
    }

    // TODO

    /*
    * vai criar 4 metodos GET recebendo de path variable dois valores ex \1\2
    * e vai retornar a operacao desses dois numeros
    * um metodo pra cada operacao
    * */
}
