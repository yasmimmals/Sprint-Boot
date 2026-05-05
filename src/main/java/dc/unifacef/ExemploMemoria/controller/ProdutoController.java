package dc.unifacef.ExemploMemoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController // classe responsavel por controlar requisições rest
@RequestMapping("/produto") // response apenas solicitações do endpoint /produto

public class ProdutoController {
    // requicição pelo verbo GET
    @GetMapping
    public String mensagem(){
        return "Hello World";
    }

}
