package br.com.samuray.sistemaonline.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamurayController {

    @RequestMapping("/nome")
    public ResponseEntity<String> getNome() {
        return ResponseEntity.badRequest().body("Erro");
    }

    @RequestMapping("/aluno/{matricula}")
    public ResponseEntity<String> getAluno(@PathVariable(name = "matricula") Integer matricula){
        return ResponseEntity.ok(matricula.toString());
    }

    @RequestMapping("/aluno/{n1}/{n2}")
    public ResponseEntity<String> getSoma(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2){
        Integer soma = n1+n2;
        return ResponseEntity.ok(soma.toString());
    }

    @RequestMapping("/aluno/{n3}/{n4}")
    public ResponseEntity<String> getSubtrai(@PathVariable("n3") Integer n3, @PathVariable("n4") Integer n4){
        Integer subtracao = n3-n4;
        return ResponseEntity.ok(subtracao.toString());
    }




    // TODO

    /*
    * vai criar 4 metodos GET recebendo de path variable dois valores ex \1\2
    * e vai retornar a operacao desses dois numeros
    * um metodo pra cada operacao
    * */
}
