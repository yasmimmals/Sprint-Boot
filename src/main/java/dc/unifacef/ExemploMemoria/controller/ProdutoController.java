package dc.unifacef.ExemploMemoria.controller;

import dc.unifacef.ExemploMemoria.Model.Produto;
import dc.unifacef.ExemploMemoria.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;

@RestController // classe responsavel por controlar requisições rest
@RequestMapping("/produto") // response apenas solicitações do endpoint /produto

public class ProdutoController {
    // injeção de dependencia
    // permite chamar métodos com objetos não instânciados
    @Autowired
    ProdutoService service;

    // requicição pelo verbo GET
    @GetMapping
    public ResponseEntity<ArrayList<Produto>> listar(){
        // retorna OK ao cliente
        // retorna a lista de produtos
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto){
        Produto novo = service.criar(produto);
        URI uri = URI.create("/produto/"+novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

}
