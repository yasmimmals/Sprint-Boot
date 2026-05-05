package dc.unifacef.ExemploMemoria.service;

import dc.unifacef.ExemploMemoria.Model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProdutoService {
    // vetor de produtos
    ArrayList<Produto> produtos = new ArrayList<>();
    private long contador = 1;


    public ArrayList<Produto> listar(){
        return this.produtos;
    }

    public Produto criar(Produto produto){
        produto.setId(contador);
        contador++; // prepara para a próxima inserção
        this.produtos.add(produto);
        return produto;
    }
}
